package DataStructure;

public class RemoveVowelSound {

    public static String returnConsonantString(String word) {
        String expected = "";
        for (int count = 0; count < word.length(); count++) {
            char covertChar = word.charAt(count);
            if (covertChar != 'a' && covertChar != 'e' && covertChar != 'i' && covertChar != 'o' && covertChar != 'u'
            && covertChar != 'A' && covertChar != 'E' && covertChar != 'I' && covertChar != 'O' && covertChar != 'U')
                expected += covertChar;

        }
        return expected;
    }
}
