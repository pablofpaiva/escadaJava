package br.com.gigabank.modelo;

public class Gerente extends Funcionario{

	private String senha = "123mudar";
	private String login = "teste@teste.com.br";
	
		public boolean autenticarSenha(String senha) {
		if(this.senha.equals(senha))
			return true;
		
		return false;		
	}
		
	public boolean autenticarSenha(String senha, String login) {
		
		if(this.senha.equals(senha) && this.login.equals(login))
			return true;
		
		return false;
	}
	
	public boolean mudarSenha(String senhaAntiga, String senhaNova) {
		
		if(this.senha.equals(senhaAntiga)) {
			this.senha = senhaNova;
			return true;
		}
		
		return false;
	}
	
	
	@Override
	//A bonificação mudou para 10% sobre o salario + 500,00 fixos
	public double getBonificacao() {
		return super.getBonificacao() + 500.0; //a referencia do super é copiar da classe mãe
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
