import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FormCharacterInWord {

    public static int returnLengthOfGoodString(String [] array,String value) {
        Optional<Integer> values = Arrays.stream(array).map((x)->{
            String r = checkValue(x,value);
        return r.length();}).reduce((x,y)->x+y);
        return values.get();
    }

    private static String checkValue(String value,String checkValue){
        String result = "";
       for(int count= 0; count< value.length();count++){
           char val = value.charAt(count);
           if(result.contains(val+""))continue;
           String result1 = checkIfExist(checkValue,val);
           String result2 = checkIfExist(value,val);
           if(result1.length() < result2.length())break;
           result+=result2;}
       if(result.equals(value))return result;
       return "";

    }

    private static  String checkIfExist(String values,char value){
        String result = "";
        for (int count = 0; count < values.length();count++){
            if(values.charAt(count) == value) result += values.charAt(count);
        }
        return result;
    }

}
