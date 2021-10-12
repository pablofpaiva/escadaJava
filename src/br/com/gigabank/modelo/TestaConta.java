package br.com.gigabank.modelo;

public class TestaConta {
	
	public static void main(String[] args) {
		
//		Cliente joao = new Cliente("João da Silva", "748.974.637-00","professor");
//		Cliente jose = new Cliente("Jose das Couves","903.320.247-68","agricultor");
		
		Conta c1 = new Conta(); //metodo contrutor da classe padrão
	//	c1.numero = 4567;
	//	c1.titular = jose;
		
		
		c1.setNumero(4567);
	//	c1.setTitular(jose);//passagem por referencia
		
		Conta c2 = new Conta(112233,0224); //metodo construtor de classe com obrigatoriedade
	//	c2.saldo = 100.0; com o encapsulamento a manipulação do saldo só pode ser feita atraves dos
		//metodos depositar(), sacar() ou transferir();
		
		
/*		Conta c3 = new Conta(4455,123,joao);
		c3.depositar(2200.0);
		System.out.println(c3.getSaldo());
		
		if(c3.sacar(600.0))
			System.out.println("Saque efetuado com sucesso");
		else
			System.out.println("Não foi possivel sacar o valor. Verique sua conta!");
		
		c3.transferir(50, c1);
		
		System.out.println("Saldo conta "+c1.getTitular().getNome() +": "+ c1.getSaldo());
		
		
		System.out.println("Saldo conta " +c3.getTitular().getNome() + ": " + c3.getSaldo());
		System.out.println(c3.getTotal());
		
		
		Conta c4 = new Conta(77889,1234,jose);
		System.out.println(c4.getTotal());*/
	}
	

}
