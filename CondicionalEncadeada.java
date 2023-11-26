package exemplos;

import java.util.Scanner;

public class CondicionalEncadeada {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um número!!");
		int numero = leia.nextInt();
		if(numero < 10) {
			if(numero <= 5) {
				System.out.println("O número é menor ou igual a 5");
			} else {
				System.out.println("O número é maior a 5");
			}
		} else {
			if(numero <= 15) {
				System.out.println("O número é menor ou igual a 15");
			} else {
				System.out.println("O número é maior a 15");
			}
		}
	leia.close();

	}
}
