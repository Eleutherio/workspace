public class Funcionario {

        private String nome;
        private String cpf;
        private double salario;
        private int tipo; // tipo 1 = Diretor CEO, tipo 2 = Recrutadores/Gencia, tipo 3 = Atendimento/base
        
        public Funcionario (String nome, String cpf, double salario, int tipo) {
        	this.nome = nome;
        	this.cpf = cpf;
        	this.salario = salario;
        	this.tipo = tipo;
        }
        
        public double GetBonifiçao() {
        	if (tipo == 1) {
        		return this.salario * 2.0;
        	} else if (tipo == 2) {
        		return this.salario * 0.5;
        } else {
        	return this.salario * 0.1;
        }
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
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
    }
