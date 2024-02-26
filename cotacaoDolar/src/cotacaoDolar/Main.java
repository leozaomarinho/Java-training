package cotacaoDolar;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dolarPrice = input.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dolarBuy = input.nextDouble();
		
		CurrencyConverter.BuyDolar(dolarPrice, dolarBuy);
		

	}

}
