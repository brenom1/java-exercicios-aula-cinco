package aulacinco;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		//Exercicio errado
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
				
		if (A % B != 0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}
		sc.close();
	}

}
