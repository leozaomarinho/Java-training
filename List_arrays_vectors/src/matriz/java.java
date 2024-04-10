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
        for (int l = 0; l < numLinhas; l++) {
            System.out.println();
            System.out.println("Linha : " + (l + 1));
            for (int c = 0; c < numCol; c++) {
                mat[l][c] = l * numCol + c + 1;
                System.out.print(" " + mat[l][c]);
            }
        }

        input.close();
    }

}
