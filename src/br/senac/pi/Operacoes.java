package br.senac.pi;

public class Operacoes {

	public static void main(String[] args) {
		String nome = "Jos�";
		String sobrenome = "Silva Filho";
		System.out.println("Nome completo: " + nome + sobrenome);
		System.out.println("----------------------------------");
		
		int idade = 21;
		boolean brasileiro = true;
		System.out.println("Idade: " + idade);
		if(brasileiro){
			System.out.println("Brasileiro: " + "sim");
		}
		System.out.println("----------------------------------");
		
		System.out.println("Opera��es matem�ticas");
		int n1 = 10;
		int n2 = 5;
		System.out.printf("A soma entre %d e %d �: ", n1, n2);
		System.out.println(n1+n2);
		System.out.printf("A subtra��o entre %d e %d �:", n1, n2);
		System.out.println(n1-n2);
		System.out.printf("A smultiplica��o entre %d e %d �: ", n1, n2);
		System.out.println(n1*n2);
		System.out.printf("A divis�o entre %d e %d �: ", n1, n2);
		System.out.println(n1/n2);
		System.out.printf("O resto entre %d e %d �: ", n1, n2);
		System.out.println(n1%n2);
		
		//Preced�ncia de avalia��o de operadores
		System.out.println(n1 + n2 * 10);
		System.out.println((n1 + n2) * 10);
	}

}
