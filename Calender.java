import java.util.*;
public class Calender {
    public static void main (String [] args){
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);


        System.out.println(year+" / "+month+" / "+day);
        System.out.println(cal.getTime());
        
        String [] daysInAWeek = {"sunday","monday","tusday","wendsday","thursday","friday","saturday"};
        int n =cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(n);
        System.out.println("day = "+daysInAWeek[n-1]);

    }
}
