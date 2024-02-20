import java.util.Scanner;

public class ut_while {

	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
		int num = 1;
		//quando nao se sabe quantas x vai ser repetido o loop
		while (num !=0) {
			System.out.println("Digite o valor: ");
			num = input.nextInt();
			
			if(num ==0) {
				System.out.print("Você escolheu sair!");
			}
			
		}
		
		input.close();
	}
	
}
