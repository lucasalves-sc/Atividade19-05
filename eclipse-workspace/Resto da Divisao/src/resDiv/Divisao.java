package resDiv;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Digite o primeiro numero.: ");
		double a=s.nextDouble();
		
		System.out.print("Digite o segundo numero.: ");
		double b=s.nextDouble();
		
		double restoDivisao=a%b;
		System.out.println("O resto da divisao �.: "+restoDivisao);
		//Crie um programa que calcule o resto da divis�o de 2 n�meros inteiros.
	}

}
