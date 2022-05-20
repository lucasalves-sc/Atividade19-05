package Area;

import java.util.Scanner;

public class AR {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Digite a area do rentagulo.: ");
		double base=s.nextDouble();
		
		System.out.println("Digite a altura do rentagulo.: ");
		double altura=s.nextDouble();
		
		double res=(base*altura)/2;
		System.out.println("A area do rentagulo é.: "+res);
		

	}

}
//Crie um programa para descobrir a área de um retângulo.
// A = (b*h)/2 sendo b = base e h = altura