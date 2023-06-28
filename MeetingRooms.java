import java.util.Arrays;

public class MeetingRooms {
    public boolean canAttendMeetings(int[][] intervals) {
        int n = intervals.length;

        // Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int i = 1; i < n; i++) {
            // Check for overlap
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        MeetingRooms solution = new MeetingRooms();
        boolean canAttend = solution.canAttendMeetings(intervals);
        System.out.println(canAttend); // Output: false
    }
}
