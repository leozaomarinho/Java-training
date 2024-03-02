package exer_banco;

public class Account {
	
	public final String numeroConta;
	public String nomeTitular;
	private double saldo = 0;
	
	public Account(String numeroConta,String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	};
	
	public Account(String numeroConta,String nomeTitular, double valorDep) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = valorDep;
	};
	
	public void Deposito(double valorDep) {
		this.saldo += valorDep;
		System.out.println("Deposito realizado com sucesso!");
		System.out.printf("Seu saldo é de: %.2f", saldo);
	}
	
	public void Saque(double valorSaque) {
		this.saldo -=(valorSaque + 5);
		System.out.println("Saque realizado com sucesso!");
		System.out.printf("Seu saldo é de: %.2f",saldo);
	}
	public double getSaldo() {
		
		return this.saldo;
	}
	
	
	
}
