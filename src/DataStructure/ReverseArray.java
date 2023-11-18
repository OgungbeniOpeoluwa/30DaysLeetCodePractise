package DataStructure;

public class ReverseArray {

    public static int[] reverseFunction(int[] arrays) {
        int [] result = new int[arrays.length];
        int counts = 0;
        for(int count = arrays.length-1; count >= 0 ; count--){
            result[counts] =arrays[count];
            counts++;
        }
        return result;
    }
}
