package DataStructure;

public class SubsequenceOfArray {

    public static boolean validateIfAArrayIsASubArray(int [] parentArray,int [] subArray) {
        int [] arrays = new int[subArray.length];
        for(int count = 0; count < subArray.length;count++){
            for(int counter = 0; counter < parentArray.length;counter++){
                if(subArray[count] == parentArray[counter]){
                    arrays[count] = counter;
                }
            }
        }
        return returnResult(arrays);
    }
    private static boolean returnResult(int [] arrays){
        boolean result = true;
        for(int count = 0; count < arrays.length;count++){
            for(int counter = count +1; counter < arrays.length;counter++){
                if(arrays[count] > arrays[counter]){
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
