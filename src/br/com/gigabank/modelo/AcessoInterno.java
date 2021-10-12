package br.com.gigabank.modelo;

/**
 * 
 * @author Flavia
 * Esse sistema faz parte de um estudo para nova uma nova equipe de desenvolvedores backend Java
 * @
 *
 */



public interface AcessoInterno {
	
	
	/**
	 * @param Strig senha => pode-se criar uma senha com até 255 caracteres alfanumericos
	 * @return retorna verdadeiro quando a senha estiver correta
	 */
	
	public boolean autenticarSenha(String senha);

}
