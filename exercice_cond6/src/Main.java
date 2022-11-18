import java.util.Locale;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Insira um valor: ");
		 double valor = sc.nextDouble();
		
		 if(valor < 0 || valor > 100) {
			 System.out.printf("Fora de intervalo");
		 }
		 else if(valor < 25) {
			 System.out.printf("Intervalo 0,25");
		 }
		 else if(valor < 50) {
			 System.out.printf("Intervalo 25,50");
		 }
		 else if(valor < 75) {
			 System.out.printf("Intervalo 50,75");
		 }
		 else {
			 System.out.printf("Intervalo 75,100");
		 }
		
		sc.close();
	}
}