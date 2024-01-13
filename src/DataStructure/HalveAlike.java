package DataStructure;

public class HalveAlike {
    private static String vowelSound = "aeiou";

    public static boolean isLengthAreTheSameAfterSplit(String word) {
        int length = word.length();
        if(length%2 == 0)return true;
        return false;
    }

    public static boolean checkIfAfterDivideHasTheSameVowelSound(String word) {
        if(!isLengthAreTheSameAfterSplit(word)) return false;
        if(countNumberOfVowel(word) % 2 == 0)return true;
        return false;
    }

    private static int countNumberOfVowel(String word){
        int counter = 0;
      for(int count = 0; count < word.length();count++){
          String wordLetter = word.charAt(count) + "";
          counter += countNumberOfVowelWithLetters(wordLetter);
      }
      return counter;
    }
    private static int countNumberOfVowelWithLetters(String letter){
        int counter = 0;
        for(int count = 0 ; count< vowelSound.length();count++){
            String vowelLetter = vowelSound.charAt(count) + "";
            if(vowelLetter.equalsIgnoreCase(letter)){
               counter++;
            }
        }
        return counter;
    }
}
