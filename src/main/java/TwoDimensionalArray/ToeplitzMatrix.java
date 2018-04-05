package TwoDimensionalArray;

/**
 * Created by devpriyadave on 3/31/18.
 */
public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0; i<c; i++ ) {
            int numb = matrix[0][i];
            int row = 1, col = i+1;
            while(row <r && col < c) {
                if(numb!=matrix[row][col]) {
                    return  false;
                }
                row++;
                col++;
            }
        }

        for(int i=1; i<r; i++ ) {
            int numb = matrix[i][0];
            int row = i+1, col = 1;
            while(row <r && col < c) {
                if(numb!=matrix[row][col]) {
                    return  false;
                }
                row++;
                col++;
            }
        }



        return true;

    }

    public boolean isToeplitzMatrixSolutuion(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) return false;
            }
        }
        return true;
    }
}
