package java1;
import java.util.Scanner;
public class Tarea01 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println( "Ingrese distancia (cm):");
		double distancia_cm = scan.nextDouble();
		if (distancia_cm<=20 && distancia_cm>=10) {
			System.out.println("Demasiado cerca"); 
		}
		else if (distancia_cm<=45 && distancia_cm>20) {
			System.out.println("Casi en el rango"); 
		}
		else if (distancia_cm<=80 && distancia_cm>45) {
			System.out.println("Listo para disparar"); 
		}
		else {
			System.out.println("Fuera de rango"); 
		}
	}
}
