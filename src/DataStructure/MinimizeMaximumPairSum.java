package DataStructure;

public class MinimizeMaximumPairSum {

    public static int maximumSumFunction(int[] arrays) {
        int [] number = sortFromAscendingToDecending(arrays);
        int numb = number.length / 2;
        int [] sum = new int [numb];
        int counter = number.length-1;
        for(int count = 0; count < numb; count++){
           int total = number[count] + number[counter];
           sum[count] = total;
           counter--;
        }
        return max(sum);
    }

    public static int [] sortFromAscendingToDecending(int [] number){
        for(int count = 0; count < number.length;count++){
            for(int counts = 0; counts < number.length;counts++){
                if(number[count] > number[counts]){
                    int temp = number[count];
                    number[count] = number[counts];
                    number[counts] = temp;
                }
            }
        }
        return number;
    }
    public static int max(int [] arrays){
        int max = arrays[0];
        for(int numb = 0; numb < arrays.length; numb++){
            if(arrays[numb] > max){
                 max = arrays[numb];
            }
        }
        return max;
    }

}
