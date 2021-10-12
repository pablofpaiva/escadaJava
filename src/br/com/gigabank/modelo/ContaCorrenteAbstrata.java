package br.com.gigabank.modelo;

public class ContaCorrenteAbstrata extends ContaAbstrata{
	
	
	private double limite;
	private boolean especial;
	
	
	//criar construtores
	//criar encapsulamentos
	
	
	@Override
	public boolean sacar(double valor) {
		if (this.limite + getSaldo() >= valor && valor > 0) {
			this.saldo -= valor;			
			return true;
		}
		
		return false;
	}
	

	@Override
	public boolean transferir(double valor, ContaAbstrata destino) {
		if (this.limite + getSaldo() >= valor && valor > 0) {
			this.saldo -= valor;	
			destino.depositar(valor);
			return true;
		}
		return false;
	}
	
	
	

}
