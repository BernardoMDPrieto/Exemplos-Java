package exemplos;

public class IncrementacaoPosFixado {
	public static void main(String[]args) {
		int valor = 10;
		
		// incrementação pós fixado, ele pega o valor, mostra e depois incrementa.
		System.out.println(valor++);// Mostra o valor 10
		System.out.println(valor);  // Mostra o valor 11
	}
}