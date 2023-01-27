 class Conta {
	private double saldo;
	int agencia;
	int numero;
	private Cliente titular;
	
	public Conta (int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		
	}

	void depositar (double valor) {
		System.out.println("Saldo anterior: " + this.saldo);
		System.out.println("Saldo atual: " + (this.saldo = saldo + valor));
		System.out.println("Depósito realizado com sucesso.");
	}
	
	
	public void saque (double valor) {
		this.saldo = saldo - valor;
	}
	
	void mudaTitular (Cliente valor) {
		System.out.println("era: " + this.titular);
		
		titular = valor;
		
		System.out.println("Agora é: " + this.titular);
	} 
	
	public boolean verConta (int numero) {
		if (true) {
		System.out.println("Titular : " + this.titular);
		System.out.println("Saldo : " + this.saldo);
		System.out.println("Agência : " + this.agencia);
		System.out.println("Numero : " + this.numero);
		} return false;
	}
	
	public boolean tranferir (double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.saldo += valor;
			System.out.println("Tranferência de $" + valor + " para " + destino.titular + " realizada com sucesso.");
			return true;
		} else {
			System.out.println("Falha na transferência. Saldo insuficiente!");
			return false;
		}
	}
	public double GetSaldo() {
		return this.saldo;
	}
	public boolean SetSaldo(double valor) {
		this.saldo = valor;
		return true;
	}
	
	public boolean SetTitular(Cliente cliente) {
		this.titular = cliente;
		return true;
	}
 } 	
 
