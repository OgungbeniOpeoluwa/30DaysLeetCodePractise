public class PerfectSquare {

    public static int returnFewestPerfectSquare(int number) {
        long temporary = number;
        int value = 0;

        int r = 0;
        int counter = 2;
        int n = 2;
        int min = number;

        for (int i = 0; i < number; i++) {
            r = counter * counter;
            while (temporary >= r) {
                temporary -= r;
                value = value + 1;
            }if (temporary % 2 == 0 && checkNumber(temporary) != 0) {
                counter = checkNumber(temporary);
                int o= counter * counter;
                temporary -= o;
                value +=1;
            }
            else if (temporary < r && temporary != 0) {
                counter--;
            } else if (temporary == 0) {
                min = max(value, min);
                n++;
                counter = n;
                temporary = number;
                value = 0;
            }
            if (r > number) break;


        }
        return min;

    }


    private static int max(int result, int secondResult) {
        if (secondResult < result) {
            return secondResult;
        }
        return result;
    }

    private static  int checkNumber(long value){
        int numb = (int) (value/2);
        double n = Math.sqrt(numb);
        if (numb % n == 0) {
            return (int) n;
        }
        return 0;
    }


}