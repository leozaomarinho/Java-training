package exer_banco;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		// variáveis
		int option;
		String numeroConta = "";
		String nomeTitular = "";
		Account conta = null;

		System.out.println("-- Bem vindo ao JavaBank --");
		// Se a opção não for sair, pedir informações do titular e criar a conta
		System.out.println("Digite o nome do titular da conta: ");
		nomeTitular = input.next();
		int numConta = (int) (Math.random() * 1000);
		numeroConta = String.valueOf(numConta);

		do {
			System.out.println("O que você deseja fazer? ");
			System.out.println("1 - Realizar Depósito");
			System.out.println("2 - Realizar Saque");
			System.out.println("3 - Ver saldo");
			System.out.println("0 - Sair");
			System.out.print("Digite uma opção válida: ");
			option = input.nextInt();

			if (option != 0) {

				if (option == 1) {
					// Realizar depósito
					System.out.println("Caso não deseje depositar nenhum valor, digite 0");
					System.out.print("Digite o valor a ser depositado: ");
					double valueDep = input.nextDouble();
					conta = (valueDep == 0) ? new Account(numeroConta, nomeTitular)
							: new Account(numeroConta, nomeTitular, valueDep);
					System.out.println("Conta criada com sucesso");
					System.out.printf("Sr(a) %s, o número da sua conta é: %s e o saldo inicial é de: %.2f%n",
							nomeTitular, numeroConta, conta.getSaldo());
				} else if (option == 2 || option == 3) {
					// Verificar se a conta foi criada antes de realizar saque ou ver saldo
					if (numeroConta.isEmpty()) {
						System.out.println("A conta ainda não foi criada, não é possível realizar a operação.");
					} else {
						if (option == 2) {
							// Realizar saque
							System.out.println("Qual será o valor do saque? ");
							double valueSaque = input.nextDouble();
							conta.Saque(valueSaque);
						} else if (option == 3) {
							// Ver saldo
							System.out.printf("O saldo da conta é: %.2f%n", conta.getSaldo());
						}
					}
				}
			} else {
				System.out.println("Você escolheu sair.");
				System.out.println("Encerrando o Java Bank...");
			}

		} while (option != 0);

		input.close();
	}
}
