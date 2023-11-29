package metodosExemplos;

import java.util.Scanner;

public class TerceiroExemploMetodo {
	
	static int somaMetodo(int numero01,int numero02) {
		return numero01+numero02;
	}
	static double somaMetodo(double numero01, double numero02) {
		return numero01+numero02;
	}
	
	
	
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe um valor inteiro para somar");
		int valor01Inteiro = leia.nextInt();
		System.out.println("Informe outro valor inteiro para somar");
		int valor02Inteiro = leia.nextInt();
		
		System.out.println("Informe um valor double para somar");
		double valor01Double = leia.nextDouble();
		System.out.println("Informe outro valor double para somar");
		double valor02Double = leia.nextDouble();
		
		int somaInteiro = somaMetodo(valor01Inteiro,valor02Inteiro);
		double somaDouble = somaMetodo(valor01Double,valor02Double);
		System.out.println(somaInteiro);
		System.out.println(somaDouble);
		leia.close();
	}
}
