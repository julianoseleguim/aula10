package br.com.db1.start.exercicio02;

public class Roupa {
	
	private String marca;
	private Integer anoFabricacao;
	
	private TipoTamanho tipoTamanho;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public TipoTamanho getTipoTamanho() {
		return tipoTamanho;
	}

	public void setTipoTamanho(TipoTamanho tipoTamanho) {
		this.tipoTamanho = tipoTamanho;
	}
	
	
	
}
