package DataStructure;

public class LengthOfLastWord {

    public static int lenghtOfLastWord(String word) {
        int result = getIndexOfLastWord(word);
        int counter = 0;
        for(int count = result;count >= 0;count--){
            String words = word.charAt(count) +"";
            if(words.equals(" ")){
                return counter;
            }
            counter++;
        }
        return counter;
    }
    private static int getIndexOfLastWord(String word){
        for(int count = word.length()-1 ; count > 0;count--){
            String result = word.charAt(count) + "";
            if(result.matches("[A-Za-z]")){
                return count;
            }
        }
        return 0;
    }
}
