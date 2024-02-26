package curso_java;
import java.util.Scanner;
import java.util.Locale;


public class Avg {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner input = new Scanner(System.in);
	//Inicio do programa
	String nome;
	double n1,n2,n3;
	System.out.println("Digite o nome do aluno: ");
	nome = input.next();
	System.out.println("Digite a primeira nota: ");
	n1 = input.nextDouble();
	System.out.println("Digite a segunda nota: ");
	n2 = input.nextDouble();
	System.out.println("Digite a terceira nota: ");
	n3 = input.nextDouble();
	//Funcao com a logica do programa
	Aprovacao(nome,n1,n2,n3);
	}
	
	public static double Aprovacao(String nome ,double nota1,double nota2, double nota3) {	
		double media = nota1+nota2+nota3;
		
		if(media >=60) {
			System.out.printf("O aluno "+nome+" foi Aprovado, nota final: %.2f%n",media);
		}
		else {
			double falta = media -60;
			System.out.printf("O aluno "+nome+" foi reprovado, nota final: %.2f, faltaram %.2f pontos para a aprovação.",media, falta);
		}
		return media;
	}

}
