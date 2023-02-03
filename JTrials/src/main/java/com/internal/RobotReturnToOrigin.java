package com.internal;

public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int horizontal = 0, vertical = 0;
        for (int i = 0; i < moves.length(); i++){
            if(moves.charAt(i)=='D')
                vertical--;
            if(moves.charAt(i)=='U')
                vertical++;
            if(moves.charAt(i)=='L')
                horizontal--;
            if(moves.charAt(i)=='R')
                horizontal++;
        }
        return horizontal==0 && vertical==0;
    }

    public static void main(String[] args) {
        RobotReturnToOrigin robot = new RobotReturnToOrigin();
        System.out.println(robot.judgeCircle("UD"));
        System.out.println(robot.judgeCircle("LL"));
        System.out.println(robot.judgeCircle("RRDD"));
        System.out.println(robot.judgeCircle("LDRRLRUULR"));
    }
}
