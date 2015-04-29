package br.com.myindaia.model;

public class ContaCorrente implements Conta, ContaTributavel {
	
	private double saldo;
	
	/*public void deposita(double valor){
		this.saldo += valor - 0.10;
	}*/
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	/*@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}*/

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
		
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public double calculaTributos() {
		return 42;
	}
}
