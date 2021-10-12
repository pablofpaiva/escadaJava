package br.com.gigabank.modelo;

public class ControleBonificacao {

	private double soma;

//	public void registrar(Gerente g) {
//
//		double bn = g.getBonificacao();
//		this.soma += bn;
//		System.out.println(this.soma);
//	}
//	
//	public void registrar(Diretor d) {
//
//		double bn = d.getBonificacao();
//		this.soma += bn;
//		System.out.println(this.soma);
//	}
	
	public void registrar(Funcionario f) {

		double bn = f.getBonificacao();
		this.soma += bn;
	}

	
	public double getSoma() {
		return soma;
	}

	

	
	
	
	
	
	

}
