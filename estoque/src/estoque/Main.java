package estoque;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		
		Product produto = new Product();
	
			System.out.print("Digite o nome do produto: ");
			produto.name = input.next();
			
			System.out.print("Digite o valor do produto: ");
			produto.valor = input.nextDouble();
			
			System.out.print("Digite a quantidade do produto: ");
			produto.quant = input.nextInt();
			
			System.out.println("Produto cadastrado com sucesso");
			
			System.out.print(produto.toString());
			
			input.close();
		

	}

}
