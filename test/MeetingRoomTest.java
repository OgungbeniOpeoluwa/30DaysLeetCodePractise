import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomTest {
    @Test
    public void assingMeetingRoomTest(){
        int [][] meetings = {{1,20},{2,10},{3,5},{4,9},{6,8}};
        int rooms = 3;
        int expected = 1;
        assertEquals(expected,MeetingRoom.returnRoomsThatHeldMoreMetting(meetings,rooms));

    }

    @Test
    public void assingMeetingToRoomTest(){
        int [][] meetings = {{0,10},{1,5},{2,7},{3,4}};
        int rooms = 2;
        int expected = 0;
        assertEquals(expected,MeetingRoom.returnRoomsThatHeldMoreMetting(meetings,rooms));

    }
    @Test
    public void assingingMeetingToAnotherRoomTest(){
        int [][] meetings = {{19,20},{14,15},{13,14},{11,20}};
        int rooms = 4;
        int expected  =  1;
        assertEquals(expected,MeetingRoom.returnRoomsThatHeldMoreMetting(meetings,rooms));

    }
    @Test
    public void assingingMeetingToAnotherRoomTestResult0(){
        int [][] meetings = {{2,13},{3,12},{7,10},{17,19},{18,19}};
        int rooms = 4;
        int expected  =  0;
        assertEquals(expected,MeetingRoom.returnRoomsThatHeldMoreMetting(meetings,rooms));

    }


}