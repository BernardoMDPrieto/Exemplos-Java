package exemplos;

import java.util.Scanner;

public class EscolhaCaso {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um valor");
		int numero = sc.nextInt();
		sc.close();
		switch (numero) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Não tem um dia correspondente");
			break;
		}
		
	}
}
