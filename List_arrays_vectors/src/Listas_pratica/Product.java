package Listas_pratica;

public class Product {

	private String NomeProd;
	private int Quant;
	private double Preco;
	
	public Product() {
		
	};
	
	public Product(String nomeProd, int quant, double preco) {
		
		this.NomeProd = nomeProd;
		this.Quant = quant;
		this.Preco = preco;
	}
	
	public String getNomeProd() {
		return NomeProd;
	}
	public void setNomeProd(String nomeProd) {
		NomeProd = nomeProd;
	}
	public int getQuant() {
		return Quant;
	}
	public void setQuant(int quant) {
		Quant = quant;
	}
	public double getPreco() {
		return Preco;
	}
	public void setPreco(double preco) {
		Preco = preco;
	}

	@Override
	public String toString() {
		return "Produto NomeProd : " + NomeProd + ", Quant : " + Quant + ", Preco : " + Preco + "";
	}
	
	
}
