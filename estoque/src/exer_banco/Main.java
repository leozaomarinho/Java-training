package exer_banco;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		//variaveis
		int option;
		double valorDep;
		String numeroConta;
		String nomeTitular;
		Account conta;
		
		System.out.println("-- Bem vindo ao JavaBank --");
		do {
			System.out.println("O que você deseja fazer? ");
			System.out.println("1 - Criar conta");
			System.out.println("2 - Realizar Deposito");
			System.out.println("3 - Realizar Saque");
			System.out.println("4 - Ver saldo");
			System.out.println("0 - Sair");
			System.out.print("Digite uma opção valida: ");
			option = input.nextInt();
			
			conta = new Account();
			
			if(option==0){
				System.out.println("Você escolheu sair.");
				System.out.println("Encerrando o Java Bank...");
			}
			
			else if(option==1) {
				System.out.println("Digite o nome do titular da conta: ");
				nomeTitular = input.next();
				int numConta = (int) (Math.random() * 1000);
				numeroConta= String.valueOf(numConta);
				System.out.println("Caso nao deseje depositar nenhum valor, digite 0");
				System.out.print("Digite o valor a ser depositado: ");
				double valueDep = input.nextDouble();
				if (valueDep ==0) {
					conta = Account(numeroConta,nomeTitular);
					System.out.println("Conta criada com sucesso");
					System.out.printf("Sr(a) "+nomeTitular+" ,o numero da sua conta é: "+numeroConta);
				}
				else {
					conta = new Account(numeroConta,nomeTitular,valueDep);
					System.out.println("Conta criada com sucesso");
					System.out.printf("Sr(a) "+nomeTitular+" ,o numero da sua conta é: "+numeroConta+" e o saldo inicial é de: "+valueDep);
				}
			}
			else if(option==2) {
				if (numeroConta.isEmpty()) {
					System.out.println("A conta ainda não foi criada, não é possivel realizar o deposito.");
				}
				else{
					System.out.print("Qual será o valor do deposito? ");
					valorDep = input.nextDouble();			
				}
			}
			else if(option==3){
				System.out.println("Qual o valor a ser sacado? ");
				double valueSaque = input.nextDouble();
				double saldo = conta.getSaldo();
				
				if (valueSaque>saldo && saldo<=0){
					System.out.print("O seu saldo ficara negativo, você deseja prosseguir? s/n ");
					String opcao = input.next();
					
					if(opcao=="s") {
						conta.Saque(valueSaque);
					}
				}
				else {
					conta.Saque(valueSaque);
				}
			}
			else if(option==4){
				conta.getSaldo();
			}
			
			
		}while(option != 0);

		input.close();
	}

}
