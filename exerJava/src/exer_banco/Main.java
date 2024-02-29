package exer_banco;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		//variaveis
		int option;
		int numeroConta = (int) (Math.random() * 1000);
		String nomeTitular
		
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
			
			
			
			
		}while(option != 0);

		input.close();
	}

}
