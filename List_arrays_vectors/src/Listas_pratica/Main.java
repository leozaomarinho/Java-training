package Listas_pratica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		List<Product> lista = new ArrayList<>();
		
		
		
		System.out.println("Digite o nome do produto: ");
		String nome = input.next();
		
		System.out.println("Digite a quantidade do produto: ");
		int quant = input.nextInt();
		
		System.out.println("Digite o valor do produto: ");
		double preco = input.nextDouble();
		
		Product product = new Product(nome,quant,preco);
		
		lista.add(product);
		
		for (Product list : lista ) {
			System.out.println(list);
		}
		
		
		input.close();
	}

}
