import java.util.Arrays;

public class SumOfEncryptedNumbers {


    public static int returnTheEncrpytedNUmberSum(int[] array) {
        int result = 0;
        for (int numb:array) {
            result += encryptNumber(numb);
        }
        return result;

    }
    public static int encryptNumber(int number){
        char [] values = String.valueOf(number).toCharArray();
        char max = values[0];
        for (int index = 1; index < values.length ; index++) {
            char codePoint = values[index];
            if(codePoint > max){
                max = codePoint;
            }
        }
        Arrays.fill(values,max);
        String result = String.valueOf(values);
        return Integer.parseInt(result);
    }
}
