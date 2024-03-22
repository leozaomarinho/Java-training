package Listas_pratica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Using_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		 List<String> nomes = new ArrayList<>();
		 
		 System.out.println("Digite o nome: ");
		 String nome = input.next();
		 nomes.add(nome);

		 System.out.println("Digite outro nome: ");
		 nome = input.next();
		 nomes.add(nome);
		 
		 for(String name : nomes){
			System.out.println(name); 
		 }
		 
		input.close();
	}

}
