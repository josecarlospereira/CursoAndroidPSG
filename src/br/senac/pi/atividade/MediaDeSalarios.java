package br.senac.pi.atividade;

import java.util.Scanner;

public class MediaDeSalarios {

	public static void main(String[] args) {
		
		System.out.print("Qual a quantidade de funcion�rios: ");
		Scanner q1 = new Scanner(System.in);
		int quant = q1.nextInt();
		double sal = 0;
		
		for(int i = 1; i <= quant; i++){
			System.out.print("Qual o valor do sal�rio: ");
			sal += q1.nextDouble();
		}
		
		double media = sal / quant;
		System.out.print("A m�dia salarial �: " + media);
		q1.close();
	}
}
