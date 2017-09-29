public class StudentAttendanceRecordI {

    public boolean checkRecord(String s) {
        int ANum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                ANum++;
            } else if (i >= 2 && s.charAt(i) == 'L' && s.charAt(i - 1) == 'L' && s.charAt(i - 2) == 'L') {//不能存在连续2个以上的L
                return false;
            }
        }
        return ANum <= 1;
    }

}
