package estoque;
import java.util.Locale;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		
		
	
			System.out.print("Digite o nome do produto: ");
			String name = input.next();
			
			System.out.print("Digite o valor do produto: ");
			double valor = input.nextDouble();
			
			System.out.print("Digite a quantidade do produto: ");
			int quant = input.nextInt();
			
			Product produto = new Product(name,valor,quant);
			System.out.println("Produto cadastrado com sucesso");
			
			System.out.print(produto.toString());
			
			input.close();
		

	}

}
