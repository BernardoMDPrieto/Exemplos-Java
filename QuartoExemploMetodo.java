package metodosExemplos;

public class QuartoExemploMetodo {
	//Recursão 
	public static void main(String[]args) {
		int resultado = contadora(10);
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
