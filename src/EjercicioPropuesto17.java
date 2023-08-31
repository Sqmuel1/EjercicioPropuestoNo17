import java.util.Scanner;
public class EjercicioPropuesto17 {

	public static void main(String[] args) {
		double r;
		Scanner entrada = new Scanner(System.in);
		r = entrada.nextDouble();
		
		System.out.println("El área del círculo es de: "+ Math.pow(r, 2)*Math.PI);
		System.out.print("El valor de la circunferencia es de: "+ r*2*Math.PI);
	}

}
