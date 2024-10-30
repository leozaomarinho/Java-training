package topicos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class usingSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criação dos conjuntos para os alunos de cada curso
        Set<Integer> cursoA = new HashSet<>();
        Set<Integer> cursoB = new HashSet<>();
        Set<Integer> cursoC = new HashSet<>();

        // Leitura dos alunos do curso A
        System.out.print("Quantos alunos estão no curso A? ");
        int nA = sc.nextInt();
        System.out.println("Digite os códigos dos alunos do curso A:");
        for (int i = 0; i < nA; i++) {
            int codigoAluno = sc.nextInt();
            cursoA.add(codigoAluno);
        }

        // Leitura dos alunos do curso B
        System.out.print("Quantos alunos estão no curso B? ");
        int nB = sc.nextInt();
        System.out.println("Digite os códigos dos alunos do curso B:");
        for (int i = 0; i < nB; i++) {
            int codigoAluno = sc.nextInt();
            cursoB.add(codigoAluno);
        }

        // Leitura dos alunos do curso C
        System.out.print("Quantos alunos estão no curso C? ");
        int nC = sc.nextInt();
        System.out.println("Digite os códigos dos alunos do curso C:");
        for (int i = 0; i < nC; i++) {
            int codigoAluno = sc.nextInt();
            cursoC.add(codigoAluno);
        }

        // Criação do conjunto total de alunos únicos
        Set<Integer> totalAlunos = new HashSet<>(cursoA);
        totalAlunos.addAll(cursoB);
        totalAlunos.addAll(cursoC);

        // Exibição do número total de alunos únicos
        System.out.println("Total de alunos distintos: " + totalAlunos.size());

        sc.close();
    }
}

