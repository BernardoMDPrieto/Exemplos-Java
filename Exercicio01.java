package exemplos;
import java.util.Scanner;
public class Exercicio01 {
	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe seu nome: ");
		String nome = leia.next();
		System.out.println("Olá " + nome);
		leia.close();
	}
}
