package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransposeMatrixTest {
    @Test
    public void given2DArrayMatrix_returnTransposeOfMatrix(){
        int [] [] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int [] [] expected = {{1,4,7},{2,5,8},{3,6,9}};
        assertArrayEquals(expected,TransposeMatrix.transposeMatrix(matrix));
    }
    @Test
    public void givenAnother2DArrayMatrix_returnTransposeOfMatrix(){
        int [] [] matrix = {{1,2,3},{4,5,6}};
        int [] [] expected = {{1,4},{2,5},{3,6}};
        assertArrayEquals(expected,TransposeMatrix.transposeMatrix(matrix));
    }
}