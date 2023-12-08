package DataStructure;

public class GradingStudents {

    public static int[] gradingFunction(int[] actualGrade) {
        for(int count = 0 ; count < actualGrade.length;count++){

            if(actualGrade[count] < 38)continue;

            int result = multiplesOfFive(actualGrade[count]);

            int diffrence = result - actualGrade[count];

            if(diffrence < 3) actualGrade[count] = result;
        }
        return actualGrade;

    }

    private static int multiplesOfFive(int number){
        int result = 0;
        while (result < number){
            result += 5;
            if(result >= number) return result;
        }
        return 0;
    }
}
