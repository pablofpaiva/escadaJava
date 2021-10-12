package br.com.gigabank.modelo;

public class TestaClienteHeranca {

	public static void main(String[] args) {
		
		ClientePF cliente1 = new ClientePF();
		ClientePJ cliente2 = new ClientePJ();
		
		Endereco endCliente1 = new Endereco("Rua", "da Consolação", "47", "casa", "São Cristóvão", "Rio de Janeiro", "RJ", "21000-000");
		Endereco endCliente2 = new Endereco("Av", "Presidente Vargas", "1250", "lj 5", "Centro", "Rio de Janeiro", "RJ", "22000-000");
		
		
		cliente1.setCpf("057.769.430-86");
		cliente1.setNome("Jose Das Couves");
		cliente1.setEndereco(endCliente1);
		cliente1.setDataNascimento("05/05/1995");
		cliente1.setProfissao("Agricultor");
		cliente1.setUniversitario(false);
		
		
		cliente2.setCnpj("10.375.986/0001-38");
		cliente2.setNome("Pais e Filhos comercio EIRELI");
		cliente2.setNomeFantasia("Loja Animaniacos");
		cliente2.setEndereco(endCliente2);
		cliente2.setSegmento("Comercio");
		cliente2.setDataFundacao("01/01/2001");
		
		
		
		Conta conta1 = new Conta(123456,447,cliente1);
		Conta conta2 = new Conta(55897,334,cliente2);
		
		
		System.out.println(conta1.getTitular().getNome());
		
		
		
		
		
		
		
	}
}
