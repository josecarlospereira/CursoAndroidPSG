package br.senac.pi.poo;

public class Ferrari {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.marca = "Ferrari";
		c1.modelo = "F448";
		c1.chassi = "F45478UIW8CWDH9";
		c1.ano = 2015;
	
		c1.partida();
		c1.acelerar();
		c1.freiar();
		
	}

}
