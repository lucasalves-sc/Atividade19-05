package datNas;

import java.util.Scanner;

public class NasDat {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Digite o nome usuario.: ");
		String nome=s.nextLine();
		
		System.out.println("Digite a idade Usuario.: ");
		int idade=s.nextInt();
		
		int res=2022-idade;
		System.out.println("O ano de nascimento É.: "+res);
		
	}

}
