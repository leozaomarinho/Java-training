import java.util.Scanner;

public class treino_java_condit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		String dia;
		
		System.out.println("Digite o dia da semana: ");
		int x  = input.nextInt();
		
		switch(x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia ="sexta";
			break;
		case 7:
			dia ="sabado";
		default:
			dia = "valor invalido";
			break;
		}
		
		System.out.print("Dia da semana: " +dia);
		
		input.close();

	}

}
