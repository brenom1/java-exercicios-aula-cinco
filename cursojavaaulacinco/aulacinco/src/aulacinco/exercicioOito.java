package aulacinco;

import java.util.Locale;
import java.util.Scanner;

public class exercicioOito {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		if (salario <= 2000.00) {
			System.out.println("isento");
		}
		else if (salario >= 2000.01 || salario <= 3000.00) {
			double imposto = 8 * salario;
			double divisao = imposto / 100;
			System.out.println("O valor do imposto é: " + divisao);
		}
		else if (salario >= 3000.01 || salario <= 4500.00) {
			double imposto = 18 * salario;
			double divisao = imposto / 100;
			System.out.println("O valor do imposto é: " + divisao);
		}
		sc.close();
	}
	//calculos de porcentagem errados
}
