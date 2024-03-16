import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomTest {
    @Test
    public void assingMeetingRoomTest(){
        int [][] meetings = {{1,20},{2,10},{3,5},{4,9},{6,8}};
        int rooms = 3;
        int expected = 0;
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
        int [][] meetings = {{18,19},{3,12},{17,19},{2,13},{7,10}};
        int rooms = 4;
        int expected = 0;
        assertEquals(expected,MeetingRoom.returnRoomsThatHeldMoreMetting(meetings,rooms));

    }

}