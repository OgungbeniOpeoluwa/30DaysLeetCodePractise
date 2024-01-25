package DataStructure;

public class ArrayPlusOne {

    public static int[] plusOne(int[] input) {
        String covertedArray = covertArrayToString(input);
        int[] returnValue = new int[covertedArray.length()];

        for(int count = 0 ; count< covertedArray.length();count++){
            String value =covertedArray.charAt(count)+"";
            int covertString = Integer.parseInt(value);
            returnValue[count] = covertString;
        }
        return returnValue;
    }

    private static String covertArrayToString(int [] input){
        String number = "";
        for(int count = 0; count < input.length; count++) {
            int value = input[count];
            number += String.valueOf(value);
        }
        int value = Integer.parseInt(number) + 1;
        return String.valueOf(value);
    }
}
