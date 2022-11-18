import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fator = 1;
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i = i + 1) {
			 fator = fator * i ;
		}
		System.out.println(fator);

		sc.close();
	}

}
