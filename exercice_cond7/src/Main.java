import java.util.Locale;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor de x e de y: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if(x == 0.0 && y == 0.0) {
			System.out.printf("Origem");
		}
		else if(x == 0.0) {
			System.out.printf("Eixo X");
		}
		else if(y == 0.0) {
			System.out.printf("Eixo Y");
		}
		else if(x > 0.0 && y > 0.0 ) {
			System.out.printf("Q1");
		}
		else if(x < 0.0 && y < 0.0) {
			System.out.printf("Q2");
		}
		else if(x > 0.0 && y < 0.0) {
			System.out.printf("Q4");
		}
		else {
			System.out.printf("Q3");
		}
		
		sc.close();
		
	}
}