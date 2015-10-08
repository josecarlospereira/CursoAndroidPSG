package br.senac.pi.atividade;

import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {
		float media = 0;
		float n1 = 4;
		float n2 = 6;
		float n3 = 5;
		media = (n1 + n2 + n3) / 3;
		System.out.print("Nome: ");
		Scanner n = new Scanner(System.in);
		String nome = n.next();
		n.close();
		System.out.print("Jovem " + nome);
		
		if (media >= 7){
			System.out.println(" você foi aprovado com a média: " + media);
		}else if (media >= 6 && media < 7){
			System.out.println(" você ficou de recuperação com a média: " + media);
		}else{
			System.out.println(" você foi reprovado com a média: " + media);
		}
		
	}
}
