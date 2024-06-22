public class FindFirstPalindromStringInArray {

    public static String firstPalindrome(String[] array) {
        for (String value:array){
            if (value.charAt(0) != value.charAt(value.length()-1)){
                continue;
            }
            if(reverseString(value))return value;
        }
        return "";
    }

    private static boolean reverseString(String value){
        String result = "";
        for(int count = value.length()-1; count>=0;count--){;
            result+= value.charAt(count);
        }
        return  result.equals(value);

    }
}
