package DataStructure;

public class UniqueBinaryString {

    public static String binaryStringFunction(String[] inputs) {
        int number = inputs[0].length();
        String result = createZeroInNumberOfLength(number,0);
        boolean check = checkArray(inputs,result);
        char values = '1';
        int count = 0;
        while(check){
            if(count < inputs[0].length()) {
                 result = changeValueAtIndex(result, count, values);
                check = checkArray(inputs, result);
                count++;
            }
           else{
               result = createZeroInNumberOfLength(number,'1');
               values = '0';
               count = 0;

           }
        }

        return result;
    }
    private static String createZeroInNumberOfLength(int length,int number){
        String result = "";
      for(int count = 0; count < length;count++){
          result += number;
      }
      return result;

    }
    private static boolean  checkArray(String [] array,String result){
        boolean answer = false;
        for(String count : array){
            if(count.equals( result)) {
                answer = true;
            }
        }
        return answer;
    }

    private static String changeValueAtIndex(String input,int index,char value){
        StringBuilder stringBuilder = new StringBuilder(input);
       stringBuilder.setCharAt(index,value);
       return String.valueOf(stringBuilder);
    }
}
