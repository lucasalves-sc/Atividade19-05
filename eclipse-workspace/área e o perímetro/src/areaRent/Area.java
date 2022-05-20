package areaRent;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Digite a altura.: ");
		double altura=s.nextDouble();
		
		System.out.println("Digite a base.: ");
		double base=s.nextDouble();
		
		double area=base*altura;
		double perimetro= (base*base)/altura;
		System.out.println("Area.: "+area);
		System.out.println("Perimetro.: "+perimetro);
	}

}
