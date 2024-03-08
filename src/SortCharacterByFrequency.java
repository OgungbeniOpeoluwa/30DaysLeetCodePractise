public class SortCharacterByFrequency {

    public static String returnStringBasedOnFrequencyCharacter(String input) {
        int max = 0;
        String container = "";

        for(int count = 0; count< input.length();count++){
            String value = input.charAt(count)+"";
            int result = countApperanceOfCharacter(input,value);
            if(container.contains(value))continue;
            String values = appendValue(value,result);
            if(result > max){
                max = result;
                container = values + container;
            }
            else container+=values;

        }
        return container;

    }
    private static int countApperanceOfCharacter(String input, String value){
        int result = 0;
        for(int count = 0; count< input.length();count++){
            if((input.charAt(count)+"").equals(value))result++;
        }
        return result;
    }

    private static String appendValue(String value,int count){
        StringBuilder container = new StringBuilder();
        for(int index = 0; index < count; index++){
            container.append(value);

        }
        return container.toString();
    }
}
