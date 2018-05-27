package br.com.db1.start.exercicio08;

public class PessoaJuridica extends Pessoa {
	
	private Integer cnpj;
	
	public Boolean validarCnpj() {
		return true;		
	}
	
	public String formatarCnpj() {
		return "";
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	
}
