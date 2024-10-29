package exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;
import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) throws Exception {
		
		 Scanner input = new Scanner(System.in);
		 //variables
		 int option =-1;	 
		 ContaBancaria conta = new ContaBancaria();

		 do {
			 System.out.println("\nO que deseja fazer ?");
			 System.out.println("1 - Sacar dinheiro");
			 System.out.println("2 - Depositar dinheiro");
			 System.out.println("3 - Ver Saldo");
			 System.out.println("0 - Sair");
		 try {
			 System.out.println("Opção: ");
			 option = input.nextInt();
			 
			 if(option == 1) {
				 System.out.print("Quanto voce deseja sacar? ");
				 double value = input.nextDouble();
				 conta.sacar(value);
			 }
			 else if(option ==2){
				 System.out.print("Quanto voce deseja depositar? ");
				 double value = input.nextDouble();
				 conta.setSaldo(value);
			 }
			 else if(option==3){
				 conta.getSaldo();
			 }
			 else if (option ==0){
				 System.out.println("Voce escolheu sair!");
				 break;
			 }
		 }
		 catch(InputMismatchException e){
			 System.out.println(" Entrada invalida. Por favor, insira um número.");
			 input.next();
		 }
		 catch(Exception e) {
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
