package DataStructure;

import java.util.Arrays;

public class LargestPositve {

    public static int findMaxK(int[] array) {
        int result = (int) Arrays.stream(array).filter(x->x==0).count();
        if (result == array.length){
            return -1;
        }
        int position = findMax(array);
        if (position == -1){
            return position;
        }
        int max = array[position];
        array[position] = 0;
        boolean value = Arrays.stream(array).filter(x->x==max*(-1)).findFirst().isPresent();
        if (value){
            return max;
        }
        return findMaxK(array);
    }


    public static int findMax(int [] array){
        int value = checkForPostive(array);
        if (value == 0){
            return -1;
        }
        int max = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] > array[max]){
                max = i;
            }
        }
        return max;
    }

    public static int checkForPostive(int [] array){
        return (int) Arrays.stream(array).filter(x->x>0).count();

    }
}
