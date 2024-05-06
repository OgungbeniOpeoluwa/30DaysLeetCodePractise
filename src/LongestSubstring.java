import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {


    public static int lengthOfLongestSubstring(String s) {
        String value = "";
        int max = 0;
        int counts = 0;
        int length = 0;
        while (counts < s.length()) {
            for (int count = counts; count < s.length(); count++) {
                String values = s.charAt(count) + "";
                if (!value.contains(values)) {
                    value += values;
                    length++;
                    continue;
                }
                break;
            }
            value = "";
            if (length > max) max = length;
            counts++;
            length = 0;

        }
        return max;
    }
}
