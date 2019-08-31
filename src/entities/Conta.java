package entities;

public class Conta {

	private int numeroConta;
	private String titular;
	private double saldo;


	
	public Conta(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}

	public Conta(int numeroConta, String titular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		deposito(depositoInicial);
	}
	
	

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double montante) {
		saldo += montante;
	}
	
	public void sacar(double montante) {
		saldo -= montante + 5.00;
	}
	
	public String toString() {
		return  "Conta: "
				+ numeroConta
				+ ", Titular: "
				+ titular
				+ ", Saldo: $ "
				+ String.format("%.2f", saldo);
	}

}
