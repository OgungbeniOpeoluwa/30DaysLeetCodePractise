package DataStructure;

import java.util.HashMap;

public class CountCharacters {

    public static HashMap<Character,Integer> returnCharacterMapped(String input) {
        HashMap<Character,Integer> returns = new HashMap<>();
        for(int count = 0; count<input.length();count++){
            char value = input.charAt(count);
            int counts = countValueInInputs(value,input);
            returns.put(value,counts);
        }
        return returns;
    }

    private static int countValueInInputs(char value,String input){
        int counts = 0;
        for(int count = 0; count < input.length();count++){
            if(input.charAt(count) == value){
                counts ++;
            }
        }
        return counts;
    }
}
