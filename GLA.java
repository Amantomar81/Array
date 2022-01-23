import java.util.Arrays;
import java.util.Scanner;

/*
Q.In GLA University there is various department. It is asked to every dept to conduct meeting for all the employees of GLA University.
 The central Management asked the dept kindly share starting time and ending time of the meeting in 24 hours format so that
after verifying it will be circulated among the GLA employees.
But there is a problem that before circulating the meeting information, the central management will find out
 if there are any clashes between time or not. If there are clashes it means the employee cannot attend all the meetings.
Can you help central management to find it out

// use this class structure

public class TimeInterval
{
 int start;
 int end;
// use constructor, getter and setter methods as per requirement
pubic boolean canAttendMeeting(TimeInterval [ ] arr)
{
	// set of statements
}
 Hint:- Single Dimension array
 */
class TimeInterval
{
    int start;
    int end;
    public TimeInterval(int start,int end){
        this.start = start;
        this.end = end;
    }
    public static boolean canAttendMeeting(TimeInterval[] arr)
    {
        int start[] = new int[arr.length];
        int end[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            start[i] = arr[i].start;
            end[i] = arr[i].end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        for (int i = 0; i < start.length; i++) {
            if(start[i+1] <= end[i]){
                return false;
            }
        }
        return true;
    }
}
public class GLA {
    public static void main(String[] args) {
        TimeInterval arr[] = new TimeInterval[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new TimeInterval(sc.nextInt(),sc.nextInt());
        }
        boolean res = TimeInterval.canAttendMeeting(arr);
        if(res == false){
            System.out.println("clashes");
        }
        else
        {
            System.out.println("np clashes");
        }
    }
}
