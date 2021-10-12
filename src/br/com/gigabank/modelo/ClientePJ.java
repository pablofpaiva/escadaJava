package br.com.gigabank.modelo;

public class ClientePJ extends Cliente {

	private String cnpj;
	private String segmento;
	private String nomeFantasia;
	private String dataFundacao;
	
	
	public ClientePJ() {
		super();
	
	}


	public ClientePJ(String cnpj, String segmento, String nomeFantasia, String dataFundacao) {
		super();
		this.cnpj = cnpj;
		this.segmento = segmento;
		this.nomeFantasia = nomeFantasia;
		this.dataFundacao = dataFundacao;
	}



	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(String dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

}
