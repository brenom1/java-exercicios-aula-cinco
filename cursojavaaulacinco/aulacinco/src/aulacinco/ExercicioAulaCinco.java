package aulacinco;

import java.util.Scanner;

public class ExercicioAulaCinco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numeroInteiro = sc.nextInt();
		
		if (numeroInteiro >= 0) {
			System.out.println("NÃO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		sc.close();
	}

}
