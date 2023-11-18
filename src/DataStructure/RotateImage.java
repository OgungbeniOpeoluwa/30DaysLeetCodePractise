package DataStructure;

public class RotateImage {

    public static int [][] rotateImageFunction(int[][] arrays) {
        int [][] result = new int[arrays.length][arrays.length];
        int counter = 0;
        for(int counts = 0; counts < arrays.length;counts++){
            for(int count = arrays[counts].length-1;count>=0;count--){
                result[counts][counter] = arrays[count][counts];
                counter++;
            }
            counter = 0;
        }
        return result;
    }
}
