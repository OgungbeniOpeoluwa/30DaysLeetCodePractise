import java.util.Arrays;

public class ReversePrefix {

    public static String reversePrefix(String word, char ch) {
        if(!word.contains(String.valueOf(ch)))return word;
        int index = word.indexOf(ch);
        String substring = word.substring(0,index+1);
        StringBuilder builder = new StringBuilder(substring);
        builder.reverse();
        builder.append(word.substring(index+1));
        return builder.toString();
    }
}
