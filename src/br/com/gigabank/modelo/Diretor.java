package br.com.gigabank.modelo;

public class Diretor extends Funcionario{
	
	
	//a bonificação mudou e agora o diretor recebe 10% de bonus sobre o salario como todos os 
	// funcionarios mais um valor fixo de 1500,00
	
//	public double getBonificacao() {
//		
//		return getSalario() * 0.3 + 3000;
//	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao() + 1500.0;
	}
	
	
	public double verSalario() {
		return this.salario;
	}
	

}
