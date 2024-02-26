package estoque;

public class Product {
	
	String name;
	double valor;
	int quant;
	
	
	public String toString() {
		return  "Nome do produto: "
				+name
				+", valor: $"
				+String.format("%.2f", valor)
				+" , quantidade: "
				+quant;
	}
	
	public void adicionarItem(int quantidade){
		this.quant += quantidade;
		
		System.out.println("Você adicionou "+quantidade+" itens ao estoque;");
	};
	
	

}
