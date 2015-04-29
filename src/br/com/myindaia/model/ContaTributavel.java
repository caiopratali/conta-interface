package br.com.myindaia.model;

public interface ContaTributavel extends Conta, Tributavel {

	Conta c = new ContaCorrente();
	Tributavel t = new ContaCorrente();
	
}
