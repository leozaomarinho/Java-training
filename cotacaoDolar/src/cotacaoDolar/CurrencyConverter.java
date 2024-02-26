package cotacaoDolar;


public  class CurrencyConverter {
	
	public static double cotacaoDolar;
	public static double valorCompra;
	public static final double iof = 0.6;
	
	
	public static double BuyDolar(double dolar,double compraValor) {
		
		cotacaoDolar=dolar;
		valorCompra=compraValor;
		
		double result = (valorCompra * cotacaoDolar) ;
		double taxa = result *0.06;
		result += taxa;
		
		System.out.printf("Amount to be paid in reais = %.2f",result);
		
		return result;
		
	}
	
}
