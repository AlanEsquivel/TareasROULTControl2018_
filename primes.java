package java1;
import java.util.Scanner;
public class primes {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println( "Imprimir los primos que hay del 1 al...");
		int n = scan.nextInt();
		if (n>=2) {
			System.out.println("2");
		}
		else {
			System.out.println("Error");
		}
		for (int j = 3; j<=n; j++) {
			int s=0;
			for (int i = 2; i<j;i++) {
				if (j%i==0) {
					s=s+1;
				}
			}
			if (s==0) {
				System.out.println(j);
			}
		}	
	}
}
