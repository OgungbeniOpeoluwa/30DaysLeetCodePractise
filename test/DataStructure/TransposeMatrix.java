package DataStructure;

import java.util.Arrays;

public class TransposeMatrix {

    public static int [] [] transposeMatrix(int[][] matrix) {
        int [][] expected = new int [matrix[0].length][matrix.length];
       for(int count = 0; count < matrix[0].length;count++) {
           for (int counts = 0; counts < matrix.length; counts++) {
               expected[count][counts] = matrix[counts][count];
           }
       }
        return expected;
    }
}
