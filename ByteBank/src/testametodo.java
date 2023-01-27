class testametodo {
 public static void main(String[] args) {
		Cliente guilherme = new Cliente();
		guilherme.nome = "Guilherme";
		guilherme.cpf = "0";
		guilherme.idade = 25;
		
		
		Conta contaguilherme = new Conta(12312, 232323);
		
		contaguilherme.SetSaldo(300);
		
		contaguilherme.SetTitular(guilherme);
		
		System.out.println(contaguilherme.GetSaldo());
		System.out.println(contaguilherme);
 }
}
