public class MaximumProductOfTwoElement {

    public static int maxProduct(int[] array) {
        int max = 0;
        for(int index = 0; index < array.length;index++){
            int value = array[index]-1;
            int result = returnResult(array,index,value);
            if(result > max)max = result;

        }
        return max;
    }

    public static int returnResult(int[]array,int index,int value){
        int max  = 0;
        for(int count = index+1; count < array.length; count++){
            int result = array[count]-1;
            int multiply = value * result;
            if(multiply > max)max = multiply;
        }
        return max;

    }
}
