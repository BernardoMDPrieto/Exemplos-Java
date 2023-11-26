package exemplos;

import java.util.Scanner;

public class CondicionalComposta {
 public static void main(String[]args) {
	 Scanner leia = new Scanner(System.in);
		System.out.println("Informe um número!!");
		int numero = leia.nextInt();
		if(numero < 10) {
			System.out.println("O número é menor que 10");
		} else {
			System.out.println("O número é maior que 10");
		}
	leia.close();
 }
}
