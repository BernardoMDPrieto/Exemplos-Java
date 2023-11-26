package exemplos;

import java.util.Scanner;

public class IfTernario {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		int numero = leia.nextInt();
		
		leia.close();
		String mensagem = (numero>10)?"O número é maior que 10":(numero==10)?"O número é igual a 10":"O número é maior que 10";
		System.out.println(mensagem);
	}
}
