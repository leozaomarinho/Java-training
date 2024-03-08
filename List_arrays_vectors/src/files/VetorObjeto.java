package files;

import java.util.Locale;
import java.util.Scanner;

public class VetorObjeto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Digite Quantos produtos deseja cadastrar: ");
		int n = input.nextInt();

		Product[] prod = new Product[n];

		for (int i = 1; i <= n; i++) {

			System.out.println("Digite o valor do produto: " + i);
			System.out.print("Digite o nome do produto: ");
			String name = input.next();
			System.out.print("Digite o valor do produto: ");
			double valor = input.nextDouble();
			System.out.print("Digite a quantidade de produto: ");
			int quant = input.nextInt();
			prod[i] = new Product(name, valor, quant);

		}
		
		for(int i=1;i<=n;i++) {
			prod.toString();
		}

		input.close();
	}

}
