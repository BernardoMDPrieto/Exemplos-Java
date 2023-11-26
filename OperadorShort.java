package exemplos;

public class OperadorShort {
	public static void main(String[]args) {
		short a = 10;
		short b = 10;
		
		//Nesta linha estamos fazendo com que a variável a receba o valor de a + b
		//O short serve para garantirmos ao programa que o valor que será entrado será menor ou igual a 32767
		a=(short)(a+b);
		System.out.println(a);
	}
}
