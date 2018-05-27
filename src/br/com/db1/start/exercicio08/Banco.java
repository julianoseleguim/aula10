package br.com.db1.start.exercicio08;

import java.util.Date;
import java.util.List;

public class Banco {
	
	private String nome;
	private Date dataFundacao;
	private String publico;
	private List<Conta> conta;
	
	public Boolean isPublico(){
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public String getPublico() {
		return publico;
	}

	public void setPublico(String publico) {
		this.publico = publico;
	}

	public List<Conta> getConta() {
		return conta;
	}

	public void setConta(List<Conta> conta) {
		this.conta = conta;
	}
	
}
