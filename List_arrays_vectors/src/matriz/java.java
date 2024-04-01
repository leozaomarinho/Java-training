package matriz;

import java.util.Scanner;

public class java {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numLinhas;
		int numCol;
		
		System.out.println("Digite a quantidade de linhas: ");
		numLinhas = input.nextInt();
		System.out.println("Digite a quantidade de colunas: ");
		numCol = input.nextInt();
		int[][] mat = new int[numLinhas][numCol];
		for(int l =1;l<=numLinhas;l++) {
			System.out.println();
			System.out.println("Linha : "+l);
			for(int c = 1;c<=numCol;c++) {
				mat[l][c] = c;
				System.out.print(" Coluna : "+c);
			}
		}
		
	}

}
