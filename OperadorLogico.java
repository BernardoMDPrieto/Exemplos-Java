package exemplos;

public class OperadorLogico {
	public static void main(String[]args) {
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a<b&&a<c);// Executa duas verificações na saída 
		System.out.println(a>b&&c>a);// só devolve true, caso as duas verificações sejam verdadeiras
		System.out.println(a<b&&a++<c);// O valor também pode ser incrementado
		System.out.println(a);// O valor continua 10 porque a condição não foi checada
		System.out.println(a<b&a++<c);
		System.out.println(a);// O valor é 11 porque a segunda condição foi checada
		System.out.println(a>b||a<c);// Comparação de ou
		System.out.println(a>b|a<c);
		
	}
}
