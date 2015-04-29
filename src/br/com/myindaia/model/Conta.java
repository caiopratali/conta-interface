package br.com.myindaia.model;

public interface Conta {
	
	public void saca(double valor);
		//this.saldo -= valor;		
	
	public void deposita(double valor);
		//this.saldo += valor;
	
	public double getSaldo();
		//return this.saldo;
	
	public void atualiza(double taxaSelic);
}
