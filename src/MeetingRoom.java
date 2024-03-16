import java.util.*;
import java.util.stream.Collectors;

public class MeetingRoom {

    public static int returnRoomsThatHeldMoreMetting(int[][] meetings, int rooms){
        boolean [] meeting = new boolean[meetings.length];
        boolean [] room = new boolean[rooms];
        int count = 0;
        int [] meetingRoom = new int[rooms];
        meetings = sort(meetings);
        int time = 0;
        HashMap<Integer, List<Integer>> mapRoomWithTime = new HashMap<>();
        int end = returnTheMaximumMeetingEndingTime(meetings);
       for(time = 0; time <  end; time++){
           if(checkIfAllIsTrue(meeting))break;
           int numb = returnEmptyRoom(room);
           if(numb != -1 && checkIfTimeIsInMeeting(meetings,time)){
               meeting = changeStatusOfMeeting(meeting,time,meetings);
               mapRoomWithTime.put(count,List.of(returnEndTimeMeeting(meetings,time)));
               meetingRoom[numb] +=1;
           } else if (numb == -1 && checkIfTimeIsInMeeting(meetings,time)) {
               int key = returnIndexWithMinimum(mapRoomWithTime);
               int ends= returnEndTimeMeeting(meetings,time) - time;
               System.out.println(ends);
               List<Integer> v = mapRoomWithTime.get(key);
               meeting = changeStatusOfMeeting(meeting,time,meetings);
               List<Integer> lists = new ArrayList<>(v);
               lists.add(v.getLast()+ends);
               mapRoomWithTime.put(key,lists);
               meetingRoom[key]+=1;
           }

       }
        System.out.println(Arrays.toString(meeting));




        return 0;

    }
    private static HashMap<Integer,List<Integer>> checkIfMeetingHasEnded(HashMap<Integer,List<Integer>> value,int time){
        for (int index = 0; index < value.size(); index++) {
            for(int count = 0; count < value.get(index).size();count++){
                if (value.get(index).get(count) == time) {
                    List<Integer> v = new ArrayList<>(value.get(index));
                    v.remove(count);
                    value.put(index,v);
                }
            }
        }
            return  value;

    }
    private  static int returnIndexWithMinimum(HashMap<Integer,List<Integer>> value){
        int min = value.get(0).getLast();
        int key = 0;
        for (int index = 1; index < value.size(); index++) {
            if(value.get(index).getLast() < min){
               min = value.get(index).getLast();
               key = index;
            }
        }
        return  key;

    }

    private static int returnEmptyRoom(boolean[] rooms){
        int numb = -1;
        for(int count = 0;count< rooms.length;count++) {
            if(!rooms[count])numb = count;

        }
        return numb;
    }

    private static boolean checkIfTimeIsInMeeting(int [][] meeting,int time){
        for (int [] value:meeting) {
            if(value[0] == time)return true;

        }
        return false;
    }
    private static int returnEndTimeMeeting(int [][] meeting,int time){
        int numb = 0;
        for (int [] value:meeting) {
            if(value[0] == time) numb = value[1];

        }
        return numb;
    }
    private static boolean[] changeStatusOfMeeting(boolean [] meeting,int time,int [][] meetings){
       for(int count = 0; count < meetings.length;count++){
           if(meetings[count][0] == time){
               meeting[count] = true;
           }
       }
        return meeting;
    }

    private static  int[][] sort(int [][] meeting){
        for(int count = 0; count < meeting.length; count++){
            int number = meeting[count][0];
            for(int counter = 0; counter < meeting.length; counter++){
                if(number<meeting[counter][0]){
                    int [] temporary = meeting[count];
                    meeting[count] = meeting[counter];
                    meeting[counter] = temporary;
                }
            }
        }
        return meeting;
    }
    private static int returnTheMaximumMeetingEndingTime(int[][]meetings){
        int max = 0;
        for (int index = 0; index < meetings.length; index++) {
            if(meetings[index][1] > max){
                max = meetings[index][1];
            }
        }
        return max;
    }
    private static boolean checkIfAllIsTrue(boolean[] meeting){
        for (boolean value:meeting) {
            if(!value)return false;
        }
        return true;
    }
}
