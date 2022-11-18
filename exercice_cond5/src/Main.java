import java.util.Scanner;
import java.util.Locale;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Insira o código do item e a quantidade: ");
		int cod = sc.nextInt();
		int qt = sc.nextInt();
		
		double total;
		
		if(cod == 1) {
		total = qt * 4.0;
		}
		else if(cod == 2) {
		total = qt * 4.5;	
		}
		else if(cod == 3) {
		total = qt * 5.0;
		}
		else if(cod == 4) {
		total = qt * 2.0;
		}
		else {
		total = qt * 1.5;
		}
		
		System.out.printf("Total %.2f\n", total);
		
		sc.close();
	}
	
	
	
	
}