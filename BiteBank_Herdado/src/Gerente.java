public class Gerente extends Funcionario {

        public Gerente(String nome, String cpf, double salario, int tipo) {
		super(nome, cpf, salario, tipo);
		
	}

        private int senha = 3097;
        
        public int SetSenha(int senha) {
        	return this.senha = senha;
        }
        
        public boolean autentica (int senha) {
        	if (this.senha == senha) {
        		System.out.println("USUÁRIO AUTENTICADO!");
        		return true;
        } else {
    		System.out.println("USUÁRIO NÃO AUTENTICADO!");
    		return false;
        	}
        }
}
