public class MoveElementGivenEndOfArray {

    public static int[] moveFunction(int[] arrays, int number) {
        int counter = 0;
        for(int count = 0; count < arrays.length; count++){
            if(arrays[count] != arrays[counter]){
                int temp = arrays[count];
                arrays[count] = arrays[counter];
                arrays[counter] = temp;
                counter++;
            }
        }
        return arrays;
    }
}
