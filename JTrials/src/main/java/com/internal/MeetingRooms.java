package com.internal;

public class MeetingRooms {
    private static boolean canAttendMeetings(int[][] intervals) {
        for(int i=0;i<intervals.length;i++){
            for(int j=i+1;j<intervals.length;j++){
                if((intervals[i][0] < intervals[j][0] && intervals[i][1] <= intervals[j][0]) ||
                        (intervals[i][0] >= intervals[j][1] ))
                    continue;
                else
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canAttendMeetings(new int[][]{{2,10}, {0,30},{15,45}}));
        System.out.println(canAttendMeetings(new int[][]{{2,10}, {11,30},{31,45}}));
    }
}
