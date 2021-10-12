package br.com.gigabank.modelo;

public class Conta {

	 private int numero;
	 private int agencia;
	 protected double saldo;
	 private Cliente titular;
	 private static int total;
	 
	 
		public Conta() {
		} // metodo construtor padrão.
		

		// metodo contrutor com sobrecargas ou parametros = obrigatoriedade
		public Conta(int numero, int agencia) {
			this.numero = numero;
			this.agencia = agencia;
		}

		// gerado automaticamente atraves do atalho Ctrl + 3 gcuf
		// (generate constructor using fields
		public Conta(int numero, int agencia,Cliente titular) {
			super();
			Conta.total++;
			System.out.println("O total de contas é: " + total);
			this.numero = numero;
			this.agencia = agencia;
			this.titular = titular;
		}

		public void depositar(double valor) {
			if (valor > 0)
				this.saldo += valor;
			return;
		}

		public boolean sacar(double valor) {

			if (this.saldo >= valor && valor > 0) {
				this.saldo -= valor;
				return true;
			}

			return false;

		}

		public boolean transferir(double valor, Conta destino) {
			if (this.saldo >= valor && valor > 0) {
				this.saldo -= valor;
				destino.depositar(valor);
				return true;
			}
			return false;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public int getAgencia() {
			return agencia;
		}

		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public Cliente getTitular() {
			return titular;
		}

		public void setTitular(Cliente titular) {
			this.titular = titular;
		}

		public static int getTotal() {
			return total;
		}


 	 
	
}
