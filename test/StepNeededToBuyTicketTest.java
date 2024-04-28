import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StepNeededToBuyTicketTest {
    @Test
    public void testSecondsNeededForPerson2ToBuyATicket(){
        int [] array = {2,3,2};
        int k = 2;
        assertEquals(6,StepNeededToBuyTicket.returnSecondsNeeded(array,k));
    }

    @Test
    public void testSecondsNeededForPerson0ToBuyATicket(){
        int [] array = {5,1,1,1};
        int k = 0;
        assertEquals(8,StepNeededToBuyTicket.returnSecondsNeeded(array,k));
    }

    @Test
    public void testSecondsNeededForPerson3ToBuyATicket(){
        int [] array = {84,49,5,24,70,77,87,8};
        int k = 3;
        assertEquals(154,StepNeededToBuyTicket.returnSecondsNeeded(array,k));
    }


}