package Listas_pratica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		List<Product> lista = new ArrayList<>();
		
		Product product = new Product();
		
		System.out.println("Digite o nome do produto: ");
		String nome = input.next();
		
		System.out.println("Digite a quantidade do produto: ");
		int quant = input.nextInt();
		
		System.out.println("Digite o valor do produto: ");
		double preco = input.nextDouble();

		
		lista.add(product);
		
		
		input.close();
	}

}
