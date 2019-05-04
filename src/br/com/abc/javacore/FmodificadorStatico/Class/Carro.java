package br.com.abc.javacore.FmodificadorStatico.Class;

public class Carro {
	private String nome;
	private double velocMax;
	public static double velocLim = 240;
	//apos a criacao do tipo static o up da variavel se torna pertencente a classe
	//e não apenas do objeto.
	
	public Carro(String nome, double velocMax) {
		this.nome = nome;
		this.velocMax = velocMax;
	}
	public void imprime() {
		System.out.println("--------------------------------");
		System.out.println("Nome: "+this.nome);
		System.out.println("Velocidade Maxima: "+this.velocMax);
		System.out.println("Velocidade Limite: "+velocLim);
	}
	public Carro() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelocMax() {
		return velocMax;
	}
	public void setVelocMax(double velocMax) {
		this.velocMax = velocMax;
	}
	
	
}
