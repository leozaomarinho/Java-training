import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// criando scanner para entrada de dados

		String nome;
		char sexo;

		System.out.print("Digite o nome: ");
		nome = input.next();
		
		System.out.print("Digite o seu sexo: ");

		sexo = input.next().charAt(0);
		

		
		// para leitura de dados do tipo char precisar que seja feito dessa forma.

		System.out.printf("O nome digitado foi %s, e o sexo é %s %n", nome, sexo);
		

		input.close();
	}
}