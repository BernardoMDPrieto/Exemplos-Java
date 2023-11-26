package exemplos;

public class IncrementacaoSegundoExemplo {
	public static void main(String[]args) {
		int valorA = 10;
		int valorB = 10;
		
		// Neste caso ele irá incrementar o valorA e somar com mais uma incrementação do valorA
		System.out.println(valorA++ + ++valorA);//O resultado é 22
		System.out.println(valorB++ + valorB++);//O resultado é 21
	}
}
