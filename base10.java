package java1;
import java.util.Scanner;
public class base10 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Ingresa la base del número que deseas convertir (2-9): ");
		int b = scan.nextInt();
		System.out.println("Ingresa el número a convertir a base 10: ");
		int num= scan.nextInt();
		int a;
		double s=0;
		int i=0;
		int c=1;
		while(c!=0) {
			a=((int) (num/Math.pow(10,i)));
			c=(int)(num/Math.pow(10,i+1))*10;
			s=s+(a-c)*Math.pow(b,i);
			i++;
			//System.out.println(a-c); si se desea imprimir los dígitos de derecha a izquierda
		}
		System.out.println("Resultado: "+s);
	}
}
