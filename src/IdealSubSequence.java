public class IdealSubSequence {

    public static int returnIdealSubSequenceLength(String values, int check) {
        int counts = 0;
        for (int index = 0; index < values.length() ; index++) {
            char value = values.charAt(index);
            int result = checkForTheSequenceInString(values,check,value,index+1);
            if(result > counts)counts=result;
        }
        return counts;
    }

    public static int checkForTheSequenceInString(String values,int check,char  value,int index ){
        int counter = 1;
        char previous = value;
        for(int count = index; count < values.length();count++){
            char secondValue = values.charAt(count);
            previous = value;
            int result = calculateChars(value,secondValue);
            if(result <= check) {
                value = secondValue;
                counter++;
            }else{
                checkForTheSequenceInString(values,check,previous,count);

            }

        }
        return counter;
    }

    public static int calculateChars(char value1, char value2){
        if(value1 > value2)return value1 - value2;
        return value2 - value1;
    }
}
