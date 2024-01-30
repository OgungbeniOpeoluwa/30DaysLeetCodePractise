package DataStructure;

public class MostAppear {

    public static int returnNumberThatAppearMore(int[] input) {
        int max = 0;
        int counter = 0;
        for(int count = 0; count< input.length;count++){
            int result = countNumberOfTimeANumberAppear(input,input[count]);
            if(result > max){
                max= result;
                counter =input[count];
            }
        }
        return counter;
    }
    public static int countNumberOfTimeANumberAppear(int [] input,int value){
        int max = 0;
        for(int count = 0; count<input.length;count++){
            if(input[count]==value){
                max++;
            }
        }
        return max;
    }
}
