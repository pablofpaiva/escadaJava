package br.com.gigabank.modelo;

public class Funcionario {
	//valor constante = não há alteração nem get nem set
	private final double INDICE = 0.05;
	
	private String nome;
	private String cpf;
	protected double salario; //apenas é permitido quando temos herança.
	private int tipo;
	//Tipo 0 = Funcionario Comum, Tipo 1 = Gerente, Tipo 2 = Diretor
	
	public Funcionario() {
		
		
	}

	public Funcionario(String nome, String cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	
		
	public double getBonificacao() {
		return this.salario * INDICE;
	}
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public double getSalario() {
		return salario + getBonificacao();
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
		

}
