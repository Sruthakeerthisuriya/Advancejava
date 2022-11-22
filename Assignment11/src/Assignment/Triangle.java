package Assignment;

public class Triangle {
	public static void main(String[] args) {
		
		for(int i=0;i<=4;i++) {
			for(int j=i;j<=4;j++) {
				int[][] arr=new int[i][j];
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
