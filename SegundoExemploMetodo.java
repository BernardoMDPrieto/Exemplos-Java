package metodosExemplos;

public class SegundoExemploMetodo {
	static void dadosCompletos(String nome,String sobrenome, int idade, String bairro) {
		System.out.println("Meu nome é " +nome+ " " +sobrenome + " tenho " + idade + " anos, moro no bairro: " + bairro);
	}
	
	
	public static void main(String[]args) {
	dadosCompletos("Bernardo","Prieto",19,"Vila nhocuné");
	}
}
