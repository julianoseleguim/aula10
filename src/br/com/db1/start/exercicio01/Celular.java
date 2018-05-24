package br.com.db1.start.exercicio01;

public class Celular {
	
	private Operadora operadora;
	private Marca marca;
	private Boolean dualChip;
	private Double tamanhoTela;

	public Boolean temSinal() {
		return false;
	}

	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Boolean getDualChip() {
		return dualChip;
	}

	public void setDualChip(Boolean dualChip) {
		this.dualChip = dualChip;
	}

	public Double getTamanhoTela() {
		return tamanhoTela;
	}

	public void setTamanhoTela(Double tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}
	
}
