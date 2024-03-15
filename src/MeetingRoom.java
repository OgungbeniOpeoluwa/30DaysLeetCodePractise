import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MeetingRoom {

    public static int returnRoomsThatHeldMoreMetting(int[][] meetings, int rooms) {
        System.out.println(Arrays.toString(Arrays.stream(meetings).flatMap(x -> Arrays.stream(x).sorted().mapToObj(int[]::new)).);
        return 0;

    }
}
