package DataStructure;

public class ValidAnagram {

    public static boolean validAnagramFunction(String firstWord, String secondWord) {
        if (firstWord.length() == secondWord.length()){
            for(int count = 0; count < firstWord.length();count++){
                String word = String.valueOf(firstWord.charAt(count));
                boolean checkIfWordExitBefore = checkIfWordHasAppearBefore(count,firstWord,word);
                if(checkIfWordExitBefore)continue;
                int counts = checkNumbersOfTimeAWordAppear(word,firstWord);
                int counter = checkNumbersOfTimeAWordAppear(word,secondWord);
                if(counts != counter)return false;
            }
        }
        else return false;
        return true;
    }
    private static  int checkNumbersOfTimeAWordAppear(String alphabet,String word){
        int result = 0;
        for(int count = 0; count < word.length();count++){
            if(alphabet.equalsIgnoreCase(word.charAt(count)+ "")){
                result++;
            }
        }
        return result;

    }

    private static boolean checkIfWordHasAppearBefore(int index,String word,String alphabet){
        for (int count = 0 ; count < index; count++){
            if(alphabet.equalsIgnoreCase(word.charAt(count)+"")){
                return true;
            }
        }
        return false;
    }
}
