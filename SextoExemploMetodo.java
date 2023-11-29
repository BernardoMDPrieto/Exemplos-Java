package metodosExemplos;

public class SextoExemploMetodo {
	public static void main(String[]args) {
		double resultado = contadora(1000);
		System.out.println(resultado);
		
	}
	public static double contadora(double valor) { 
		if(valor > 0) {
			return valor + contadora(valor-1);
		} else {
			return 0;
		}
	}
}

