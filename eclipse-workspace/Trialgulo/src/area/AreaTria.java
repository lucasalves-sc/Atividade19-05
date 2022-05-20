package area;
import java.util.Scanner;
public class AreaTria {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Digite da base.: ");
		double base=s.nextDouble();
		
		System.out.println("Digite a altura.: ");
		double altura=s.nextDouble();
		
		double areaTriangulo=(base*altura)/2;
		System.out.println("Area do Triangulo.: "+areaTriangulo);
	}

}
