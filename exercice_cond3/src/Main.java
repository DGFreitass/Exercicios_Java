import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Insira o primeiro numero:");
		int a = sc.nextInt();
		System.out.printf("Insira o segundo numero:");
		int b = sc.nextInt();

		if(a % b == 00 || b % a == 00) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}
		
		sc.close();
		
		
		
	}
	
	
	
}