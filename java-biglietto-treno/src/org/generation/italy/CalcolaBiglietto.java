

package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nome: ");
		String name = sc.nextLine();

		System.out.print("Km che vuoi percorrere: ");
		int km = sc.nextInt();

		System.out.print("La tua eta': ");
		int age = sc.nextInt();

		sc.close();

		float cost = (float) (km * .21f);

		if (age <= 12) {
			cost = 0;
			System.out.printf("Il prezzo totale è: " + cost + "€");

		} else if (age <= 18) {
			cost = cost - (cost * 20) / 100;
			System.out.printf("Il prezzo totale è: " + cost + "€");

		} else if (age >= 65) {
			cost = cost - (cost * 40) / 100;
			System.out.printf("Il prezzo totale è: " + cost + "€");

		} else {
			System.out.printf("Il prezzo totale è: " + cost + "€");
		}

	}

}
