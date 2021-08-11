/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendarlab042;
import java.util.GregorianCalendar;
/**
 *
 * @author hp
 */
public class CalendarLab042 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GregorianCalendar calendar  = new GregorianCalendar();
        System.out.println("Current year, month, date, and day of week");
        System.out.print("Year is ");
        System.out.println(calendar.get(GregorianCalendar.YEAR));
        System.out.print("Month is ");
        System.out.println(calendar.get(GregorianCalendar.MONTH));
        System.out.print("Date is ");
        System.out.println(calendar.get(GregorianCalendar.DATE));
        System.out.print("Day of week is ");
        System.out.println(calendar.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("------------");
        System.out.println("After specified the elapsed time of one day after current day");
        calendar.setTimeInMillis(calendar.getTimeInMillis()+24*60*60*1000);
        System.out.println("Current year, month, date, and day of week");
        System.out.print("Year is ");
        System.out.println(calendar.get(GregorianCalendar.YEAR));
        System.out.print("Month is ");
        System.out.println(calendar.get(GregorianCalendar.MONTH));
        System.out.print("Date is ");
        System.out.println(calendar.get(GregorianCalendar.DATE));
        System.out.print("Day of week is ");
        System.out.println(calendar.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(calendar.getTime());
    }
    
}
