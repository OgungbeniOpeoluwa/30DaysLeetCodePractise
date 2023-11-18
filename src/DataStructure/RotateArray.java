package DataStructure;

public class RotateArray {


    public static int[] rotateFunction(int[] arrays,int number) {
        int [] result = new int[arrays.length];
        int counts = 0;
        for(int count = number; count < arrays.length; count++){
            result [counts] = arrays[count];
            counts++;
        }
         counts = 0;
        int total = getTotal(arrays, number);
        for(int count = total; count < arrays.length; count++){
            result [count] = arrays[counts];
            counts ++;
        }
        return result;

    }

    private static int getTotal(int[] arrays, int number) {
        return (arrays.length) - number;
    }
}
