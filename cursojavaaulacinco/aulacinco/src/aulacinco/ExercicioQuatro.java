package aulacinco;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int primeiraHora = sc.nextInt();
		int segundaHora = sc.nextInt();
		
		int calculoUm = 24 - primeiraHora;
		int calculoDois = calculoUm + segundaHora;
		
		if (calculoDois > 24) {
			int calculoTres = calculoDois - 24;
			System.out.printf("O JOGO DUROU: %d HORA(S)", calculoTres);
		} 
		else {
			System.out.printf("O JOGO DUROU: %d HORA(S)", calculoDois);
		}	
		sc.close();
	}

}
