package br.com.gigabank.modelo;

public class ContaPoupancaAbstrata extends ContaAbstrata {
	
	private double rendimento;

	@Override
	public boolean sacar(double valor) {
		if(this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			return true;
		}
		return false;
	} 

	@Override
	public boolean transferir(double valor, ContaAbstrata destino) {
		if(this.saldo >= valor && valor >0) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}
		return false;
	}
	
	
	//criar construtores
	//criar encapsulamentos
	
	

}
