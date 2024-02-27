package estoque;

public class Product {
	
	private String name;
	private double valor;
	private int quant;
	
	//utilizando sobrecargas
	public Product(){	
	};
	
	public Product(String name,double valor) {
		this.name = name;
		this.valor = valor;
	}
	
	public Product(String name, double valor, int quant) {
		this.name = name;
		this.valor = valor;
		this.quant = quant;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

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
