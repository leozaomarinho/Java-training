package exe_proposto;

public class Funcionarios {

	private int Id;
	private String Nome;
	private double Salario;
	
	public Funcionarios() {
		
	};
	
	public Funcionarios(int id,String nome, double salario) {
		this.Id=id;
		this.Nome=nome;
		this.Salario=salario;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionarios [Id :" + Id + ", Nome :" + Nome + ", Salario :" + Salario + "]";
	};
	
	
	
	
	
	
}
