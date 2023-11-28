package exemplos;

public class Matriz02 {
	public static void main(String[]args) {
		int[][] myNum = {{1,2,3},
						 {4,5,6},
						 {7,8,9}};
		myNum[1][2] = 7;
		System.out.println(myNum[1][2]);
	
	}
}
