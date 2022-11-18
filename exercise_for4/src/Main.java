import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		
		for(int i = 0; i<n; i = i + 1) {
			
			int numerador = sc.nextInt();
			int denominador = sc.nextInt();
			
				if(denominador == 0 ) {
					System.out.println("Divisão impossivel");
			}
				else {
					double divisao = (double) numerador / denominador;
					System.out.printf("%.1f%n", divisao);
				}
				
		}
		
		

		sc.close();
		
	}

}
