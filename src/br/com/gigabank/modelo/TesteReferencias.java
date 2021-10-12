package br.com.gigabank.modelo;

public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Maria");
		g1.autenticarSenha("123456");
		g1.setSalario(5000.0);
		
		//So pega as informação que vem da classe Funcionario
		//POLIMORFISMO
		Funcionario g2 = new Gerente();
		g2.setNome("André");
		g2.getBonificacao();
				
		Diretor d1 = new Diretor();
		d1.setSalario(10000);
		d1.setNome("Antonio");
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registrar(g1);
		controle.registrar(d1);
		
			
	
	}

}
