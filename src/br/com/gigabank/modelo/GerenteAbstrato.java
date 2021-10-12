package br.com.gigabank.modelo;

public class GerenteAbstrato extends FuncionarioAbstrato implements AcessoInterno{

	private String senha = "123mudar";
	
	@Override
	public double getBonificacao() {
		return getSalario() + 1500;
	}

	
	@Override
	public boolean autenticarSenha(String senha) {
		if(this.senha.equals(senha))
			return true;
		
		return false;
	}
	
	
	
	
}
