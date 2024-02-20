import java.util.Scanner;
public class do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int result = 25;
		int calc = 0;
		
		do{
			System.out.println("Qual é o resultado de 5x5 ");
			calc = input.nextInt();
			
			if(result == calc) {
				System.out.printf("Você acertou o resultado: "+calc);
			}
			else {
				System.out.println("Resposta errada!");
			}
		}
		while(result != calc);
		input.close();
	}

}
