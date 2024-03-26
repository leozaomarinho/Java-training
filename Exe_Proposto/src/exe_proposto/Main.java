package exe_proposto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// variaveis
		int quantFunc, id;
		String nome;
		double salario;
		
		

		System.out.println("Digite a quantidade de funcionarios que voce deseja cadastrar: ");
		quantFunc = input.nextInt();

		Funcionarios[] funcionarios = new Funcionarios[quantFunc];

		for (int i = 0; i < quantFunc; i++) {
			System.out.println("== Cadastro de funcionario ==");
			id = i;
			System.out.println("Digite o nome do funcionario: ");
			nome = input.next();
			System.out.println("Digite o salario do funcionario: ");
			salario = input.nextDouble();
			
			Funcionarios funcionario = new Funcionarios(id,nome,salario);
			
			funcionarios[i] = funcionario;
		}

		input.close();
	}
}
