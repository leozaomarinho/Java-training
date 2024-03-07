package files;

import java.util.Locale;
import java.util.Scanner;

public class PrimeiroExe {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double sum =0,avg=0;
		int n = input.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i <n; i++) {
			System.out.println("Digite o valor do vetor na posição: " + i);
			vect[i] = input.nextDouble();
		}

		System.out.println("Valores inseridos no vetor: ");
		for (int i = 0; i <n; i++) {
		
		sum+=vect[i];
		}
		avg=sum/n;
		System.out.printf("A media é: %.2f",avg);

		input.close();
	}

}
