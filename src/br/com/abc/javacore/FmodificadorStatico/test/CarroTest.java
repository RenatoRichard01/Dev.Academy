package br.com.abc.javacore.FmodificadorStatico.test;

import br.com.abc.javacore.FmodificadorStatico.Class.Carro;

public class CarroTest {
	public static void main(String[] args) {
		Carro car1 = new Carro("BMW", 280);
		Carro car2 = new Carro("Corolla", 350);
		Carro car3 = new Carro("Fusca", 500);
		car1.imprime();
		car2.imprime();
		car3.imprime();
		//car1.setVelocLim(300);
		//Metodologia pede que quando houver variaveis do tipo static, quem deve chamar o metodo/variavel e a propria classe.
		//Carro.velocLim = 300.0;
		Carro.setVelocLim(300);
		System.out.println("====================");
		car1.imprime();
		car2.imprime();
		car3.imprime();
		
	}
}
