package DataStructure;

public class DifferenceBetweenZeroAndOneInRowAndColoumn {

    public static int[][] diffrenceMatrixFunction(int[][] array) {
        int [][] expected = new int [array.length][array[0].length];
        int count = 0;
        for(int row = 0; row < array.length;row++){
            while(count < array[row].length ) {
                int firstResult = calculateDifference(1, array, row, 0,count);
                int secondResult = calculateDifference(0, array, row, firstResult,count);
                expected[row][count] = secondResult;
                count++;
            }
            count = 0;
        }
        return expected;
    }
    private static int checkForOneOrZeroRow(int number,int[][]array , int row){
        int result = 0;
        for(int counts = 0; counts < array[row].length;counts++){
            if(array[row][counts] == number){
                result++;
            }
        }
        return result;
    }

    private static int checkForOneOrZeroInColoumn(int number, int [][]array , int index){
        int result = 0;
        for(int count = 0; count < array.length;count++){
            if(array[count][index] == number){
                result++;
            }
        }
        return result;
    }
    private static int calculateDifference(int number, int [][]array , int index,int addition,int count) {
        int result = checkForOneOrZeroRow(number,array,index);
        int result2 = checkForOneOrZeroInColoumn(number,array,count);
        int returns = 0;
        if(number == 1){
           returns = result + result2;
        }
        else{
            returns = addition -result - result2;
        }
        return returns;

    }

}
