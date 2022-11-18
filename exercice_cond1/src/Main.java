import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Insira o numero: ");
		int x = sc.nextInt();
		
		if(x >= 0) {
			System.out.println("Esse numero é positivo");
		}
		else {
			System.out.println("Esse numero é negativo");
		}
		
		sc.close();
	}
	
}