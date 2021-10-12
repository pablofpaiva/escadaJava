package br.com.gigabank.modelo;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		
		Funcionario f1 = new Funcionario("Zé da Silva","159.428.310-92",3000.0);
		f1.setTipo(2);
		//System.out.println(f1.getBonus());
		
		
		Gerente g1 = new Gerente();
		g1.setNome("Flavia Almeida");
		g1.setSalario(5000.0);
		
		
		if(g1.autenticarSenha("123mudar"))
			System.out.println("Bem-Vindo(a) "+ g1.getNome());
		else
			System.out.println("Verifique a senha!");
		
		
		if(g1.mudarSenha("123mudar", "123456"))
			System.out.println("Senha alterada com sucesso!");
		else
			System.out.println("Verifique senhas digitadas!");
		
		
		if(g1.autenticarSenha("123456", "teste@teste.com.br"))
			System.out.println("Logado com sucesso!");
		else 
			System.out.println("Verifique dados digitados!");
		
				
		System.out.println("Valor da bonificação "+ g1.getBonificacao());
		System.out.println("Valor do salario total " + g1.getSalario());
		
		g1.salario = 150000.0;
		
	
	Diretor d1 = new Diretor();
	d1.setSalario(10000);
	System.out.println("Valor da bonificação "+ d1.getBonificacao());
	System.out.println(d1.verSalario());
	
	
	}
	
	
	
	

}
