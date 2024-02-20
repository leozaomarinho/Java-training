import java.util.Scanner;
public class ut_func {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String wife,husband,son;
		
		System.out.println("Qual o seu nome: ");
		husband = input.next();
		
		System.out.println("Qual o nome da sua esposa: ");
		wife = input.next();
		
		System.out.println("Qual o nome do seu filho: ");
		son = input.next();
		
		Familia(husband,wife,son);
		
		
		

	}
	
	public static void Familia(String marido,String esposa,String filho) {
		
		System.out.println(marido+" é marido de "+esposa+" que é mãe de "+filho);
	}

}
