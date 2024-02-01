import java.util.ArrayList;
import java.util.List;

public class ReversePolishNotation {

    public static int returnReversePolish(String[] input) {
        List <String> covertInput = convertArrayToInt(input);
        int count = 0;
        while(covertInput.size() != 1){
            if(covertInput.get(count).matches("[-,+,*,/]")){
                int result = caculateNumbers(covertInput,count);
                covertInput.remove(count);
                covertInput.remove(count-1);
                covertInput.remove(count-2);
                covertInput.add(count-2,String.valueOf(result));
                count = 0;
                continue;
            }
            count++;
        }
        int results = Integer.parseInt(covertInput.get(0));
        return results;

    }

    private static int caculateNumbers(List<String> input, int count) {
        int firstNumber = Integer.parseInt(input.get(count-2));
        if(input.get(count).equals("+"))return firstNumber + Integer.parseInt(input.get(count-1));
        else if(input.get(count).equals("-"))return firstNumber - Integer.parseInt(input.get(count-1));
        else if(input.get(count).equals("*"))return firstNumber * Integer.parseInt(input.get(count-1));
        else return firstNumber / Integer.parseInt(input.get(count-1));
    }


    private static List<String> convertArrayToInt(String [] input){
        List<String> result = new ArrayList<>();
        for(int index = 0; index< input.length;index++ ){
            result.add(input[index]);
        }
        return result;
    }
}
