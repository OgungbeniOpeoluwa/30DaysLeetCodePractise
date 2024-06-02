import java.util.Arrays;

public class ModifyArray {

    public static Object[] reverseString(String[] value) {
        int number = value.length-1;
        for (int i = 0; i < value.length/2; i++) {
            String result = value[i];
            value[i] = value[number];
            value[number] = result;

            number--;

        }
        System.out.println(Arrays.toString(value));
        return value;
    }
}
