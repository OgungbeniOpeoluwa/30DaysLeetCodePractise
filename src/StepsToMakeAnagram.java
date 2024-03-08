import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StepsToMakeAnagram {

    public static int getMinimumStepsOfAnagram(String value1, String value2) {
        int counts = 0;

        StringBuilder builder = new StringBuilder(value2);
        StringBuilder builder2 = new StringBuilder(value1);

        for (int count = 0; count < value1.length() ; count++) {
            System.out.println(value2);
            int numb = replaceValue((value1.charAt(count)+""),value2);
            if(numb != -1) {
                value1 = builder2.deleteCharAt(count).toString();
                value2 = builder.deleteCharAt(numb).toString();
                count --;
                System.out.println(value2);
            }


            else{
                counts++;
            }



        }
        return counts;

    }

    private static int replaceValue(String letter, String value2){
        for (int index = 0; index < value2.length() ; index++) {
            if(letter.equals(value2.charAt(index)+"")){
               return index;
            }

        }
        return -1;
    }
}
