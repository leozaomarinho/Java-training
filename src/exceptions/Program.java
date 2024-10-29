package exceptions;

import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner input = new Scanner(System.in);
		 int option;
		 
		 ContaBancaria conta = new ContaBancaria();

		 System.out.println("O que deseja fazer ?");
		 System.out.println("1 - Sacar dinheiro");
		 System.out.println("2 - Depositar dinheiro");
		 System.out.println("3 - Ver Saldo");
		 System.out.println("0 - Sair");
		 
		 option = input.nextInt();
		 do {
		 try {
			 if(option == 1) {
				 System.out.print("quanto voce deseja sacar? ");
				 double value = input.nextDouble();
				 conta.sacar(value);
			 }
			 if(option ==2){
				 System.out.print("quanto voce deseja depositar? ");
				 double value = input.nextDouble();
				 conta.setSaldo(value);
			 }
			 if(option==3){
				 conta.getSaldo();
			 }
			if (option ==0){
				 System.out.println("Voce escolheu sair!");
				 break;
			 }
		 }
		 catch(Exception e){
			 System.out.println(e.getMessage());
		 }
		 finally {
			 System.out.println("Ação finalizada !");	 
		 }//Fim do tryCatch
		 
		 }
		 while(option!=0);
		//Fim do while
		 
		 input.close();
	}

}
