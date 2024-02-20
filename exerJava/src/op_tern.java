
public class op_tern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double preco = 50;
		double desconto = (preco <20.0) ? preco * 0.1 : preco * 0.05;
		//operador ternario
		System.out.printf("Valor do desconto é %.2f",desconto);
		

	}

}
