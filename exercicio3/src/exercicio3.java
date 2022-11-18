import java.util.Scanner;
import java.util.Locale;

public class exercicio3 {
	
	public static void main(String[] args) {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double TT = 3.14159;	
			double Raio = sc.nextDouble();
			double A = TT*Math.pow(Raio,2);
			
			
			System.out.printf("Area = %.4f%n", A);
			
			sc.close();
			

	}

}
