import java.util.Scanner;

public class pratica_if_else {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.print("Digite o seu nome: ");
		nome = input.next();
		
		System.out.print("Digite a sua idade: ");
		idade = input.nextInt();
		
		if (idade>=18){
			
			if(idade>=60) {
				System.out.print("O "+nome+" é idoso");
			}
				else {
				System.out.println("O "+ nome+ " é maior de idade");
				}
		}
		
		else {
			System.out.println("O "+ nome + "é menor de idade");
		}

		input.close();
	}

}
