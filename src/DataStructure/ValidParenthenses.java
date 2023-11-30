package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;

public class ValidParenthenses {
    static String [] parentheses = {"(",")","{","}","[","]"};


    public static boolean checkIfParenthesesIsValid(String input) {
        ArrayList <Integer> arrays = new ArrayList<>();
        int results = 0;
        for(int count = 0; count < parentheses.length; count++){
            results = checkIfItContains(input, parentheses[count]);
            arrays.add(results);
        }
        ArrayList <Boolean> trues = result(arrays);
        if(trues.contains(false)) return false;
        else return true;
    }


    private static  int checkIfItContains(String input,String checker){
        int result = 0;
        for(int count = 0; count < input.length();count++){
            if(checker.equals(String.valueOf(input.charAt(count)))){
                result++;

            }
        }
        return result;
    }

    private static ArrayList <Boolean> result(ArrayList <Integer>arrays){
        System.out.println(arrays);
        ArrayList <Boolean> returns = new ArrayList<>();
        int counter = 1;
        for(int count = 0; count < arrays.size(); count+=2){
            if(arrays.get(count) == 0 && arrays.get(counter) == 0){
                 counter+=2;
                 continue;
            }
            if(arrays.get(count) == arrays.get(counter)){
                 counter+=2;
                returns.add(true);
            }
            else returns.add(false);
        }
        return returns;
    }
}
