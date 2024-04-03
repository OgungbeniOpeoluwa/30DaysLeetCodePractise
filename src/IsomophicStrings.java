import java.util.HashMap;

public class IsomophicStrings {

    public static boolean returnIfStringIsIsomophic(String s, String t) {
        HashMap<String, String> map = new HashMap<>();

        if (s.length() == t.length()) {
            System.out.println("b");
            return isomorphic(s, t, map);
        } else{
            return false;
        }
    }

    private static boolean isomorphic(String s, String t, HashMap<String, String> map) {
        for (int count = 0; count < s.length(); count++) {
            String character = s.charAt(count) + "";
            String value = checkIfValueExistHasKey(character, map);
            if (value != null) {
                String r = t.charAt(count) + "";
                if (!r.equals(value)) return false;
            }
            if (value == null) {
                String values = t.charAt(count) + "";
                if (checkIfValueExist(values, map)) return false;
                else map.put(character, values);

            }
        }
        return true;
    }

    private static String checkIfValueExistHasKey(String s, HashMap<String,String> values){
        String value = values.get(s);
        if (value != null)return value;
        return null;
    }
    private static boolean checkIfValueExist(String s, HashMap<String,String> values) {
       return values.containsValue(s);
    }
}
