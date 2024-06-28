
public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
    private Disponibilidade disponibilidade;

	
	public Produto(String nome, double preco, int quantidade) {
		super();
		this.setNome(nome);
		this.setPreco(preco);
		this.setQuantidade(quantidade);
		this.atualizarDisponibilidade();
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Disponibilidade getDisponibilidade() {
        return disponibilidade;
    }

    private void atualizarDisponibilidade() {
        if (this.quantidade > 0) {
            this.disponibilidade = Disponibilidade.DISPONIVEL;
        } else {
            this.disponibilidade = Disponibilidade.ESGOTADO;
        }
    }

	@Override
	public String toString() {
		return "Produto : " +nome+" -  Preco : "+preco+" - Quantidade : "+quantidade;
	}
	
	

	
	
}
