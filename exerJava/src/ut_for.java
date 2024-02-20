import java.util.Scanner;
public class ut_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// quando se sabe quantas x vai utilizar o loop
		Scanner input = new Scanner(System.in);
		
		int soma =0;
		
		for(int i =0; i<=50;i++) {
			
			soma = i;
			
			System.out.println(soma);
			
		}

		input.close();
	}

}
