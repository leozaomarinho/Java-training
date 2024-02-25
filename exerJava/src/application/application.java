package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;
 

public class application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Triangle x;
		
		x = new Triangle();
		
		System.out.print("Entre com as medidas do triangulo: ");
		x.a = input.nextInt();
		x.b = input.nextInt();
		x.c = input.nextInt();
		
		System.out.print("primeira medida: "+x.a+", segunda medida: "+x.b+", terceira medida: "+x.c);

		System.out.printf("Trianulo x area: %.4f", x.area());
		
		input.close();
	}

}
