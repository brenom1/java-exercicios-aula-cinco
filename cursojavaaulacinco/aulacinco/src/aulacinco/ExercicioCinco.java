package aulacinco;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double codigoUm = 4.00;
		double codigoDois = 4.50;
		double codigoTres = 5.00;
		double codigoQuatro = 2.00;
		double codigoCinco = 1.50;
		
		double codigo = sc.nextDouble();
		double quantidade = sc.nextDouble();
		
		if (codigo == 1) {
			double resultado = codigoUm * quantidade;
			System.out.printf("Total: R$ %.2f", resultado);
		} 
		else if (codigo == 2) {
			double resultado = codigoDois * quantidade;
			System.out.printf("Total: R$ %.2f", resultado);
		}
		else if (codigo == 3) {
			double resultado = codigoTres * quantidade;
			System.out.printf("Total: R$ %.2f", resultado);
		}
		else if (codigo == 4) {
			double resultado = codigoQuatro * quantidade;
			System.out.printf("Total: R$ %.2f", resultado);
		}
		else if (codigo == 5) {
			double resultado = codigoCinco * quantidade;
			System.out.printf("Total: R$ %.2f", resultado);
		}
		sc.close();
	}

}
