package br.com.myindaia.main;


import br.com.myindaia.model.AtualizadorDeContas;
import br.com.myindaia.model.Conta;
import br.com.myindaia.model.ContaCorrente;
import br.com.myindaia.model.ContaPoupanca;

public class Principal {
	public static void main(String[] args){
		Conta c = new ContaCorrente();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		c.atualiza(1.0);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		System.out.println("Saldo Total: " + adc.getSaldoTotal());
		
	}	
}
