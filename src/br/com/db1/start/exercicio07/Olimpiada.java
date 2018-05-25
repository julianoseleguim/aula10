package br.com.db1.start.exercicio07;

public class Olimpiada {

	private Integer ano;
	private Pessoa pessoa;
	private Modalidade modalidade;
	private Sede sede;
	
	public Olimpiada(Pessoa pessoa, Modalidade modalidade, Sede sede) {
		this.pessoa = pessoa;
		this.modalidade = modalidade;
		this.sede = sede;		
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}
		
}
