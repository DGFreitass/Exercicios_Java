import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Insira a hora inicial do jogo: ");
		int a = sc.nextInt();
		
		System.out.printf("Insira hora final do jogo:");
		int b = sc.nextInt();
		
		int f;
		
		if(a >= b ) {
		f =  (24 - a ) + b;
		System.out.println("Hora final: " + f);
		}
		else {
		f = (b - a);
		System.out.println("Hora final: " + f);
		}
		
		sc.close();
	}
}