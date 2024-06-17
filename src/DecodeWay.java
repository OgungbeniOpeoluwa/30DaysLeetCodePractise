import java.util.HashMap;

public class DecodeWay {

    public static int numDecoding(String value) {
        HashMap<String,String> mapValue = mapAlphabeth();

        return 0;
    }

    private static HashMap<String,String> mapAlphabeth(){
        int count = 1;
        HashMap<String,String> mapValue = new HashMap<>();
        for (int index = 97; index < 123; index++) {
            String values = Character.toString(index);
            mapValue.put(String.valueOf(count),values);
            count++;
        }
        return mapValue;

    }
}
