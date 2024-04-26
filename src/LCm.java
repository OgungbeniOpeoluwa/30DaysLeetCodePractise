import java.util.Scanner;

public class LCm {

    public static int returnLcm(int...array) {
        int divide = 2;
        int result = 1;
        while(allNumbersIsNotOne(array)){
            while (numberIsStillDivisible(array,divide)){
                array= divideNumber(array,divide);
                result *= divide;

            }
            divide++;
        }
        return result;

    }

    private static int[] divideNumber(int[] array , int divide){
        for (int i = 0; i < array.length; i++) {
            if (array[i]%divide==0 ){
                array[i] = array[i] /divide;
            }

        }
        return array;
    }

    private static boolean numberIsStillDivisible(int [] array , int division){
        for (int index = 0; index < array.length; index++) {
            if(array[index] % division == 0){
                return true;
            }

        }
        return false;
    }

    private static boolean allNumbersIsNotOne(int [] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 1)return true;
        }
        return false;
    }
}
