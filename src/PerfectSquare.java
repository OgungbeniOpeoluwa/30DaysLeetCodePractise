public class PerfectSquare {

    public static int returnFewestPerfectSquare(int number) {
        long temporary = number;
        int value = 0;

        int r = 0;
        int counter = 1;
        int n = 1;
        int min  =  number;

        while(r < number){
            r  = counter * counter;
            if(temporary > r){
                temporary -= r;
                value = value+1;
            }
            else if (temporary < r) {
                counter = perfectSquare(counter,temporary);
            }
            else{
                min = max(value,min);
                n++;
                counter = n;
                temporary = number;
                value = 0;
            }


        }
        return min;

    }


    private static  int perfectSquare(int count , long value){
        while(value > count){
            count --;
        }
        return count;
    }

    private static int max(int result , int secondResult){
            if(secondResult < result){
                return  secondResult;
            }
            return  result;
    }
}
