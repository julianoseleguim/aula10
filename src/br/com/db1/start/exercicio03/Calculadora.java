package br.com.db1.start.exercicio03;

public class Calculadora {

	private Double primeiroValor;
	private Double segundoValor;
	private Double resultado;
	
	public void zerarCalculo() {		
		primeiroValor = 0d;
		segundoValor = 0d;
		resultado = 0d;		
	}
	
	public void somar(Double valor1, Double valor2) {		
		resultado = valor1+valor2;
	}
	
	public void subtrair(Double valor1, Double valor2) {				
		resultado = valor1-valor2;
	}
	
	public void divir(Double valor1, Double valor2) {				
		resultado = valor1/valor2;
	}
	
	public void multiplicar(Double valor1, Double valor2) {				
		resultado = valor1*valor2;
	}
	
	public Double exibirResultado() {
		return resultado;
	}
	
	public Calculadora() {
		Calculadora calculadora = new Calculadora();
	}

	public Double getPrimeiroValor() {
		return primeiroValor;
	}

	public void setPrimeiroValor(Double primeiroValor) {
		this.primeiroValor = primeiroValor;
	}

	public Double getSegundoValor() {
		return segundoValor;
	}

	public void setSegundoValor(Double segundoValor) {
		this.segundoValor = segundoValor;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}
	
	
	
}
