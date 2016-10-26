/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

import java.text.DecimalFormat;

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
           System.err.println("Error. Hours must be between 0 >= ");
       }
   }
   
   private int toMins() {
       return 60 * hours + mins;
   }
   
   public boolean equals(Time other) {
       return this.hours == other.hours && this.mins == other.mins;
   }
   
   public int elapsedSince(Time other) {
       //  other is t1
       int diff = Math.abs(this.toMins() - other.toMins());
       if (diff <= 12*60) {
           return 1;//diff;
       }  else {
           return ( (12*60 - toMins()));
       }
   }
   
   public String toString() {
       DecimalFormat df = new DecimalFormat("00"); 
       // "0" means don't omit leading zero 
       return (df.format(hours) + ":" + df.format(mins));
       // return String.format("%02d:%02d", hours, mins);

   }
    
}
    