package br.com.db1.start.exercicio08;

public class Conta {

	private Integer numero;
	private Integer digitoVerificador;
	private Pessoa pessoa;
	private Agencia agencia;
	
	public Conta(Pessoa pessoa, Agencia agencia) {
		this.pessoa = pessoa;
		this.agencia = agencia;
	}
	
	public void calcularDigitoVerificador() {		
	}
	
	public Boolean validarDigitoVerificador() {
		return true;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(Integer digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
		
}
