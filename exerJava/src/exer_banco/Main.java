package exer_banco;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		//variaveis
		int option;
		String numeroConta;
		String nomeTitular;
		
		
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
			
			if(option==0){
				System.out.println("Você escolheu sair.");
				System.out.println("Encerrando o Java Bank...");
			}
			
			else if(option==1) {
				System.out.println("Digite o nome do titular da conta: ");
				nomeTitular = input.next();
				int numConta = (int) (Math.random() * 1000);
				
				numeroConta= String.valueOf(numConta);
				System.out.println("Conta criada com sucesso");
				System.out.printf("Sr(a) "+nomeTitular+" ,o numero da sua conta é: "+numeroConta);
			}
			else if(option==2) {
				if (numeroConta.isEmpty()) {
					System.out.println("A conta ainda não foi criada, não é possivel realizar o deposito.");
				}
				else{
					
				}
			}
			
			
		}while(option != 0);

		input.close();
	}

}
