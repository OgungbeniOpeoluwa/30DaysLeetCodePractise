package DataStructure;

public class DuplicateNumber {

    public static int returnNumberThatIsNotDuplicated(int[] input) {
        int value = 0;
        for(int index = 0; index < input.length;index++){
            if(checkValueThatAppearMoreThanOnce(input,input[index],index))continue;
            value = input[index];
        }
        return value;

    }

    private static boolean checkValueThatAppearMoreThanOnce(int [] input,int value,int index){
        for(int count = 0; count <input.length;count++){
            if(count==index)continue;
            if(input[count]==value)return true;
        }
        return false;
    }
}
