public class ExistenceOfSubstringInActualAndReverse {


    public static boolean checkIfSubstringExist(String value) {
        for(int count = 0; count < value.length();count++){
            int range = count + 2;
            if(range > value.length())break;
            String values = value.substring(count,range);
           if (checkIfExistInSubstring(value,values))return true;
        }
        return false;
    }
    public static boolean checkIfExistInSubstring(String value,String substring){
        StringBuilder builder = new StringBuilder(value);
        builder.reverse();
        for(int count = 0; count < builder.length();count++){
            int range = count+2;
            if (range > builder.length())break;
            String values = builder.substring(count,range);
           if(values.equals(substring))return true;
        }
        return false;
    }
}
