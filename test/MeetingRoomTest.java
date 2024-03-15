import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomTest {
    @Test
    public void assingMeetingRoomTest(){
        int [][] meetings = {{1,20},{2,10},{3,5},{4,9},{6,8}};
        int rooms = 2;
        int expected = 0;
        assertEquals(expected,MeetingRoom.returnRoomsThatHeldMoreMetting(meetings,rooms));

    }

}