public class LargestThreeSum {

    public static String returnLargestSumOfDigit(String number) {
        for(int count = 9; count >= 0;count--){
            String value = findNumbrInString(number,count);
            if(checkIfAllValuesAreTheSame(value,String.valueOf(count)) && value.length() == 3) return value;

        }
        return "";
    }
    private static String findNumbrInString(String number, int count){
        String values = "";
        for (int index = 0; index < number.length(); index++) {
            String value = number.charAt(index) +"";
            if(index == number.length()-1) {
                values = value;
                return values;
            }
            else if(value.equals(String.valueOf(count)) && index+3 < number.length()){
                values = number.substring(index,index+3);
                return values;
            }
        }
        return values;
    }
    private static boolean checkIfAllValuesAreTheSame(String value,String val){
        for (int index = 0; index < value.length() ; index++) {
            String result = value.charAt(index) +"";
            if(!result.equals(val))return false;
        }
        return true;
    }


}
