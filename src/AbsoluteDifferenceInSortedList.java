public class AbsoluteDifferenceInSortedList {

    public static int[] sumFunction(int[] arrays) {
        int [] result = new int[arrays.length];
        int total = 0;
        int count = 0;
        for(int numbers : arrays){
            for(int number : arrays){
                if(numbers < number){
                    total +=  number - numbers;
                }
                else{
                    total += numbers - number;
                }
            }
            result[count] = total;
            count++;
            total = 0;
        }
        return result;

    }

}
