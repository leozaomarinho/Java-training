package files;

public class Product {

	private String NomeProd;
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
		Valor = valor;
	}

	public int getQuant() {
		return Quant;
	}

	public void setQuant(int quant) {
		Quant = quant;
	}

	private double Valor;
	private int Quant;
	
	public Product() {
		
	};
	
	public Product(String nome,double valor, int quant) {
		this.NomeProd = nome;
		this.Valor = valor;
		this.Quant = quant;
	}
}
