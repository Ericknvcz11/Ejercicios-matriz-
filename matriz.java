
public class matriz {
	public void multMatrix() {
		int[][] matrix1 = {{1,2}, {3,-2}, {0,1}}; 
		int[][] matrix2 = {{-3,-1,-2}, {5,-2,-1}};
		int[][] matrixResult = new int [3][3]; 
		
		for (int n = 0; n < matrix1.length; n++) {
			for(int a = 0; a < matrix2[0].length; a++) {
				int sum = 0; 
				for(int b = 0; b < matrix2.length; b++) {
					sum += matrix1[n][a] * matrix2[a][b];
				}
				matrixResult [n][a] = sum; 
				
			}
		}
		
		for(int n = 0; n < matrixResult.length; n++) {
			for(int a =0; a < matrixResult[0].length; a++) {
				System.out.println(matrixResult[n][a] + " "); 
			}
			System.out.println(); 
		}
		
	}//default
}//default
