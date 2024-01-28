package DataStructure;

import java.util.ArrayList;
import java.util.List;

public class FindPlayerWithZeroOrOneLooses {

    public static int [][] returnPlayersWithOneLostAndZeroLost(int[][] matches) {
        int [] zeroLost = returnZeroLost(matches);
        int [] lostOneMatch = returnPlayersWithOneLost(matches);
        int [] [] winnerAndLoser = {zeroLost,lostOneMatch};
        return winnerAndLoser;
    }

    public static int soughtInAscendingOrder(List<Integer>array){
        int minimum = array.get(0);
        for(int count = 1; count< array.size();count++){
            if(array.get(count)<minimum) {
                minimum = array.get(count);
            }

        }
        return minimum;
    }
    public static List<Integer> removeNumber(List<Integer>array,int value){
        for(int count = 0 ; count< array.size(); count++){
            if(array.get(count) == value){
                array.remove(array.get(count));
            }
        }return array;
    }

    public static List<Integer> arrangeNumber(List<Integer>array){
        List<Integer> copyOfArray = array;
        int counter = copyOfArray.size();
        List<Integer> arrangeNumber= new ArrayList<>();
        while (counter > 0) {
            int minimum = soughtInAscendingOrder(array);
            arrangeNumber.add(minimum);
            array = removeNumber(array, minimum);
            counter--;
        }
        return arrangeNumber;
    }

    private static int [] returnZeroLost(int[][] matches) {
        List<Integer> zerLost = new ArrayList<>();
        for(int count = 0; count < matches.length; count++){
            int value = matches[count][0];
            if(checkIfAnyOneLostTheMacth(matches,value)){
                continue;
            }if(checkIfNumberAlreadyExist(zerLost,value)){
                 continue;
            }
            zerLost.add(value);
        }
        return convertListToArray(arrangeNumber(zerLost));
    }

    private static int [] convertListToArray(List<Integer>matches){
        int []  array = new int [matches.size()];
        for(int count = 0; count < matches.size();count++){
            array[count] = matches.get(count);
        }
        return array;
    }

    public static int [] returnPlayersWithOneLost(int[][] matches) {
        List<Integer> lostOneMatch = new ArrayList<>();
        for(int count = 0; count < matches.length;count++){
            int value = matches[count][1];
            int counter =countNumberOfMatchesLost(matches,value);
            if(counter>1)continue;
            if(checkIfNumberAlreadyExist(lostOneMatch,value))continue;
            lostOneMatch.add(value);
        }

        return convertListToArray(arrangeNumber(lostOneMatch));
    }


    private static boolean checkIfAnyOneLostTheMacth(int [][] array, int value){
        for(int count = 0; count < array.length;count++){
            if(array[count][1] == value)return true;
        }
        return false;
    }

    private static  int countNumberOfMatchesLost(int [] [] matches,int value){
        int counter  = 0;
        for(int count = 0; count < matches.length;count++){
            if(matches[count][1] == value){
                counter++;
            }
        }
        return counter;
    }
    private static boolean checkIfNumberAlreadyExist(List<Integer> number,int value){
        for(int count = 0; count< number.size(); count++){
            if(number.get(count)==value)return true;
        }
        return false;
    }
}
