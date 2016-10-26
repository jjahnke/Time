import java.text.DecimalFormat;
import java.time.LocalTime;
/**
 *
 * @author jdjahnke
 */
public class Time {
   private int hours;
   private int mins;
   
   public Time() {
       hours = 0;
               
       mins = 0;
   }
   
   public Time(int h, int m) {
       if ((h >= 0 && h < 24) && (m >= 0 && m < 60)) {
           hours = h;
           mins = m;
       } else {
           System.err.println("Error. Hours must be 0 <= h < 24, and " +
                   "Minutes must be 0<=mins < 60 ");
       }
   }
   
   private int toMins() {
       return 60 * hours + mins;
   }
   
   public boolean equals(Time other) {
       return this.hours == other.hours && this.mins == other.mins;
   }
   
   @Override
   public String toString() {
       //DecimalFormat df = new DecimalFormat("00"); // "0" means don't omit leading zero
       //return (df.format(hours) + ":" + df.format(mins));
       return String.format("%02d:%02d", hours, mins);

   }
    
    /*
   Write a method elaspsedSince(Time t) that returns the number of minutes 
   elapsed from t to this time. Assume that t ≤ this time < t + 24h. 
   For example, if this time is 8:30 and t is 22:55 the method assumes that t is on the previous day 
   and returns 585 (minutes). Hint: use toMins
   */

    public int elapsedSince(Time t) {
        int diff = Math.abs(this.compareTo(t));
        System.out.println("diff " + diff);
        if (diff > (720)) {
            diff = this.toMins(); // + (24*60 - t.toMins());
            
            // t1 and t2 are reversss
        }
        return diff;    //return Math.abs(m1-m2);
    }
    
    public int compareTo(Time t) {
        return this.toMins() - t.toMins();
    }
    
    public void addMinutes(int m) {
        int mins = this.toMins() + m;
        this.hours = mins / 60;
        this.mins = mins % 60;
    }
                
    public Time createTime(int m ) {
        int totalMins = this.toMins() + m;
        int hours = totalMins / 60;
        int min = totalMins % 60;
        return new Time(hours,min);
    }
    
}
