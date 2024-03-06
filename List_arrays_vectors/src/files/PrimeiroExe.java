package files;

import java.util.Locale;
import java.util.Scanner;

public class PrimeiroExe {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i <n; i++) {
			System.out.println("Digite o valor do vetor na posição: " + i);
			vect[i] = input.nextDouble();
		}

		System.out.println("Valores inseridos no vetor: ");
		for (int i = 0; i <n; i++) {
			System.out.print(+vect[i] + " ");
		}
		input.close();
	}

}
