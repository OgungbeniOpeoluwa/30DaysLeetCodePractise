package DataStructure;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class PlusOne {

    public static int[] plusOne(int[] array) {
        String result = returnArraysValueInString(array);
        long addition = Integer.parseInt(result) + 1;
        String value = String.valueOf(addition);
        return turnIntegerToArray(value);
    }



    private static String returnArraysValueInString(int [] array){
        String result = "";
        for(int count = 0; count < array.length; count++){
            result += String.valueOf(array[count]);
        }
        return  result;
    }
    private static int [] turnIntegerToArray(String input){
        int [] returnAdditionArray = new int[input.length()];
        for(int count = 0; count < input.length();count++){
            String result = String.valueOf(input.charAt(count));
            returnAdditionArray[count] = Integer.parseInt(result);
        }
        return returnAdditionArray;

    }

}
