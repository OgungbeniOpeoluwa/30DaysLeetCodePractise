package DataStructure;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GradingStudentsTest {
   @Test
   public void testThatStudentGradeAreRoundOffAccordingToTheRules() {
       int [] actualGrade = {73,67,38,33};
       int [] expectedGrade = {75,67,40,33};
       assertArrayEquals(expectedGrade,GradingStudents.gradingFunction(actualGrade));
   }
    @Test
    public void testThatGradeFor3StudentsAreRoundOffAccordingToTheRules() {
        int [] actualGrade = {84,29,57};
        int [] expectedGrade = {85,29,57};
        assertArrayEquals(expectedGrade,GradingStudents.gradingFunction(actualGrade));
    }

}