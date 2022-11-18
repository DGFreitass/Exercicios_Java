import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int fnumb, fhour;
		double payh, res; 
		
		
		fnumb = sc.nextInt();
		fhour = sc.nextInt();
		payh = sc.nextDouble();
		
		
		res = fhour * payh;
		
		
		System.out.println("Number: " + fnumb);
		System.out.printf("Salary: %.2f", res);
				
		sc.close();
		
	}

}
