import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("1 Quadrante");
			}
			else if(x < 0 && y > 0 ) {
				System.out.println("2 quadrante");
			}
			else if(x < 0 && y < 0 ) {
				System.out.println("3 quadrante");
			}
			else {
				System.out.println("4 quadrante");
			}
			x = sc.nextInt();
			y = sc.nextInt();
				
		}		
			sc.close();
		
	}
}