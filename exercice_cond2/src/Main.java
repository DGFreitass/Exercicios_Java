import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.printf("Insira o numero:");
		int x = sc.nextInt();

		
		
		if(x % 2 == 0) {
			System.out.println("Par");
					}
		else {
			System.out.println("Impar");
		}
		
		sc.close();
		
	}
	
}