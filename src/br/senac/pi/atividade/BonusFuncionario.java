package br.senac.pi.atividade;

import java.util.Scanner;

public class BonusFuncionario {

	public static void main(String[] args) {
		
		System.out.println("--> B�nus Salarial <--");
		System.out.print("Quanto o Gerente recebe R$: ");
		Scanner g = new Scanner(System.in);
		double ger = g.nextDouble();
		double gere = ger + (ger * 0.15);
		System.out.println("Receber�: " + gere);
		
		System.out.print("Quanto o Coordenador recebe R$: ");
		double co = g.nextDouble();
		double coo = co + (co * 0.1);
		System.out.println("Receber�: " + coo);
		
		System.out.print("Quanto o Supervisor recebe R$: ");
		double su = g.nextDouble();
		double sup = su + (su * 0.08);
		System.out.println("Receber�: " + sup);
		
		g.close();
		
	}

}
