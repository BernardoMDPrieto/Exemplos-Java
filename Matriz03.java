package exemplos;

public class Matriz03 {
	public static void main(String[]args) {
		
		int[][] numero = {{1,2,3,4},{5,6,7,8}};
		
		for(int i = 0; i < numero.length; i++) {
			
			for(int j = 0; j < numero[i].length; j++) {
				
				System.out.println(numero[i][j]);
				
			}
			
		}
		
	}
}
