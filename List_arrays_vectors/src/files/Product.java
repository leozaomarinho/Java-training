package files;

public class Product {

	private String NomeProd;
	private double Valor;
	private int Quant;
	
	public Product() {
		
	};
	
	public Product(String nome,double valor, int quant) {
		NomeProd = nome;
		Valor = valor;
		Quant = quant;
	}
	public String getNomeProd() {
		return NomeProd;
	}

	public void setNomeProd(String nomeProd) {
		NomeProd = nomeProd;
	}

	public double getValor() {
		return Valor;
	}

	public void setValor(double valor) {
		this.Valor = valor;
	}

	public int getQuant() {
		return Quant;
	}

	public void setQuant(int quant) {
		this.Quant = quant;
	}
	
	public String toString() {
		return "Produto : "
				+NomeProd+
				", Valor do produto : "
				+Valor+
				", Quantidade : "
				+Quant;
	}
	
	
}
