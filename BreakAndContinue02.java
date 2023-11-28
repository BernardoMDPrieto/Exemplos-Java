package exemplos;

public class BreakAndContinue02 {
	public static void main(String[]args) {
		// Exemplo continue
		for(int i = 0; i < 10; i++) {
			if(i == 4) {
				continue;
			}
			System.out.println(i);
		}
	}
}
