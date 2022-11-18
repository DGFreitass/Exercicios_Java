import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codpeça1, numpeça1, codpeça2, numpeça2;  
		double valuepeça1, valuepeça2, pay;
		
		codpeça1 = sc.nextInt();
		numpeça1 = sc.nextInt();
		valuepeça1 = sc.nextDouble();
		codpeça2 = sc.nextInt();
		numpeça2 = sc.nextInt();
		valuepeça2 = sc.nextDouble();
		
		pay = (numpeça1 * valuepeça1) + (numpeça2 * valuepeça2);
		
		System.out.printf("Valor a pagar: %.2f", pay);
		
		sc.close();
		
		
	}

}
