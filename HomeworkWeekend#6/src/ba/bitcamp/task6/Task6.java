package ba.bitcamp.task6;

public class Task6 {
	
	public static void main(String[] args) {
		
		int[][] matrix = new int[3][5];
		fillArray(matrix);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void fillArray(int[][] matrix) {
		fillArray(matrix, 0, 0, 0);
	}

	private static void fillArray(int[][] matrix, int i, int j, int k) {
		if (i == matrix.length) {
			return;
		}
		if (j == matrix[i].length - 1) {
			matrix[i][j] = k;
			j = 0;
			i += 1;
			k += 1;
		} else {
			matrix[i][j] = k;
			j += 1;
			k += 1;
		}
		fillArray(matrix, i, j, k);

	}

}
