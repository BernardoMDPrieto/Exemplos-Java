package exemplos;

public class WhileBreakAndContinue02 {
	public static void main(String[]args) {
		int i = 0;
		while(i <10){
			if(i == 4) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}
