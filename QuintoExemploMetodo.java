package metodosExemplos;

public class QuintoExemploMetodo {
	public static void main(String[]args) {
		int resultado = contadora(100);// resultado da soma dos 100 primeiros números
		System.out.println(resultado);
		
	}
	public static int contadora(int valor) { 
		if(valor > 0) {
			return valor + contadora(valor-1);
		} else {
			return 0;
		}
	}
}

