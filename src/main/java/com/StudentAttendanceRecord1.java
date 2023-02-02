package com;

public class StudentAttendanceRecord1 {
    private static boolean checkRecord(String s) {
        if(s.indexOf('A')<s.lastIndexOf('A')) {
            return false;
        }else if(s.indexOf("LLL")>-1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL"));
    }
}
