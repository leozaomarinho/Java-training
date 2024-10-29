package entities;

public class ContaBancaria {
	private double Saldo;
	private double limiteSaque;
	
	public ContaBancaria() {
		
	};
	
	public ContaBancaria(double saldo, double limiteSaque) {
		Saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo =+ saldo;
		System.out.println("Valor depositado com sucesso!");
	}
	public double getLimiteSaque() {
		return limiteSaque;
	}
	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void sacar(double valor) throws Exception {
		try {
			if (valor>Saldo) {
				throw new Exception("Erro: Saldo insuficiente.");
			}
			if (valor>limiteSaque){
				throw new Exception("Erro: Valor do saque excede o limite.");
			}
			Saldo -=valor;
			System.out.println("Saque realizado com sucesso!");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Refaça a operação");
		}
	}
	
	@Override
	public String toString() {
		return "ContaBancaria [Saldo=" + Saldo + ", limiteSaque=" + limiteSaque + "]";
	}
}
