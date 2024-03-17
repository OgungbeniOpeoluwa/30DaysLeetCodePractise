import java.util.*;
import java.util.stream.Collectors;

public class MeetingRoom {

    public static int returnRoomsThatHeldMoreMetting(int[][] meetings, int rooms){
        boolean [] meeting = new boolean[meetings.length];
        int count = 0;
        int [] meetingRoom = new int[rooms];
        meetings = sort(meetings);
        int time = 0;
        HashMap<Integer, List<Integer>> mapRoomWithTime = new HashMap<>();
        int end = returnTheMaximumMeetingEndingTime(meetings);
       for(time = 0; time <  end; time++){
           if(checkIfAllIsTrue(meeting))break;
           if(count != rooms && checkIfTimeIsInMeeting(meetings,time) && !checkEndingTime(mapRoomWithTime,time)){
               meeting = changeStatusOfMeeting(meeting,time,meetings);
               mapRoomWithTime.put(count,List.of(returnEndTimeMeeting(meetings,time)));
               meetingRoom[count] +=1;
               count++;
           } else if ( count == rooms&& checkIfTimeIsInMeeting(meetings,time)) {
               int key = returnIndexWithMinimum(mapRoomWithTime);
               int ends= returnEndTimeMeeting(meetings,time) - time;
               List<Integer> v = mapRoomWithTime.get(key);
               meeting = changeStatusOfMeeting(meeting,time,meetings);
               List<Integer> lists = new ArrayList<>(v);
               lists.add(v.getLast()+ends);
               mapRoomWithTime.put(key,lists);
               meetingRoom[key]+=1;
           } else if (checkEndingTime(mapRoomWithTime,time)) {
               for (int index = 0; index < mapRoomWithTime.size(); index++) {
                   for(int counts = 0; counts < mapRoomWithTime.get(index).size();counts++){
                       if (mapRoomWithTime.get(index).get(counts) == time) {
                           List<Integer> v = new ArrayList<>(mapRoomWithTime.get(index));
                           v.remove(counts);
                           v.add(counts,0);
                           mapRoomWithTime.put(index,v);
                           if(checkIfTimeIsInMeeting(meetings,time)){
                               int key = returnIndexWithMinimum(mapRoomWithTime);
                              v = new ArrayList<>(mapRoomWithTime.get(key));
                              v.add(returnEndTimeMeeting(meetings,time));
                              meetingRoom[key] +=1;
                              mapRoomWithTime.put(key,v);
                           }
                       }
                   }
               }

           }

       }




        return max(meetingRoom);

    }

    private static  int  max(int [] meetingRoom){
     int max = meetingRoom[0];
     int key = 0;
        for (int index = 1; index < meetingRoom.length ; index++) {
            if(meetingRoom[index] > max){
                max = meetingRoom[index];
                key = index;
            }

        }
        return key;
    }

    private static boolean checkEndingTime(HashMap<Integer,List<Integer>> value,int time){
        for (int index = 0; index < value.size(); index++) {
            for(int count = 0; count < value.get(index).size();count++){
                if (value.get(index).get(count) == time) return true;
            }
        }
        return  false;

    }
    private  static int returnIndexWithMinimum(HashMap<Integer,List<Integer>> value){
            int min = value.get(0).getLast();
            int key = 0;
            for (int index = 1; index < value.size(); index++) {
                if (value.get(index).getLast() < min) {
                    min = value.get(index).getLast();
                    key = index;
                }
            }

            return key;


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
