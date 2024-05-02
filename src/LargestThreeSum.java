public class LargestThreeSum {

    public static String returnLargestSumOfDigit(String number) {
        String result = "";
        for(int count = 9; count >= 0;count--){
            String value = findNumbrInString(number,count);
            result = checkIfAllValuesAreTheSame(value,String.valueOf(count));
            if(result.length()>=3)return result;
            result = "";


        }
        return result;
    }
    private static String findNumbrInString(String number, int count){
        String values = "";
        for (int index = 0; index < number.length(); index++) {
            String value = number.charAt(index) +"";
            if(value.equals(String.valueOf(count))){
                values = number.substring(index);
                return values;
            }
        }
        return values;
    }
    private static String checkIfAllValuesAreTheSame(String value,String val){
        String results ="";
        for (int index = 0; index < value.length() ; index++) {
            String result = value.charAt(index) + "";
            if (result.equals(val)) {
                results += value.charAt(index);
                if(results.length() == 3)return results;
            }
           else{
               results="";};

        }
        return results;
    }


}
