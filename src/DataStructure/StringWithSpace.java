package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringWithSpace {

    public static int[] returnStringWithSpaceHighestAndLowest(String word) {
        List<Integer> addedNumber = checkForNextIndex(word);
        int [] numb = {SquareAndAscending.minimum(addedNumber),maximum(addedNumber)};
        return numb;
    }

    public static int maximum(List <Integer> number){
        int numb = number.get(0);
        for(int count = 1 ; count < number.size(); count ++){
            if(number.get(count)> numb){
                numb = number.get(count);
            }
        }
        return numb;

    }
    public static List<Integer> checkForNextIndex(String word){
        List<Integer> words = new ArrayList<>();
        String numb ="";
        String numbs = "";
        for(int count = 0; count< word.length();count++){
             numbs = word.charAt(count)+"";
            if(!numbs.equals(" ")){
                numb+= numbs;
            }
            else{
                int returns = Integer.parseInt(numb);
                words.add(returns);
                numb ="";
            }
        }
        int number = Integer.parseInt(numb);
        words.add(number);
        return words;
    }

}
