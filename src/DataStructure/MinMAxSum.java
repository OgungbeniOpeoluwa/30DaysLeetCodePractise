package DataStructure;

public class MinMAxSum {

    public static String minMaxFunction(int [] arrays) {
        int total = 0;
        int totals = 0;
        String result = "";
        if(arrays.length == 5){
            int mini = min(arrays);
            int max = max(arrays);
            for(int count = 0; count < arrays.length; count++){
                if(arrays[count] != mini){
                    total+=arrays[count];
                }
                if(arrays[count] != max){
                    totals+= arrays[count];
                }

            }
        }
        result = totals + "  " +total;
         System.out.println(result);
         return result;

    }
    private static int  min(int [] arrays){
        int min = arrays[0];
        for(int numb = 1; numb < arrays.length;numb++){
            if(arrays[numb] < min){
                min = numb;
            }
        }
        return min;

    }

    private static int  max(int [] arrays){
        int max = arrays[0];
        for(int numb = 1; numb < arrays.length;numb++){
            if(arrays[numb] > max){
                max = arrays[numb];
            }
        }
        return max;

    }
}
