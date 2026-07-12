class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String [] st=startTime.split(":");
        String [] et=endTime.split(":");
        int ans=0;
        int stHour = Integer.parseInt(st[0]);
int stMin = Integer.parseInt(st[1]);
int stSec = Integer.parseInt(st[2]);
int endHour = Integer.parseInt(et[0]);
int endMin = Integer.parseInt(et[1]);
int endSec = Integer.parseInt(et[2]);
int start = stHour * 3600 + stMin * 60 + stSec;
int end = endHour * 3600 + endMin * 60 + endSec;
 ans = end - start;
if (ans < 0) {
    ans += 24 * 3600;
}

return ans;}
}
