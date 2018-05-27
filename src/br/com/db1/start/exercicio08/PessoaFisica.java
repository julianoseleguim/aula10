package br.com.db1.start.exercicio08;

public class PessoaFisica extends Pessoa {

	private Integer cpf;
			
	public Boolean validarCpf() {
		return true;		
	}
	
	public String formatarCpf() {
		return "";
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

}
