import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int z = sc.nextInt();
		int soma = x + z;
		
		System.out.println("Resultado: " + soma);
		
		sc.close();
		
	}
}