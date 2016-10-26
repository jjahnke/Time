import java.util.Scanner;

public class TestTime
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Time 1" );
    System.out.print("Enter hours: " );
    int h1 = keyboard.nextInt();
    System.out.print("Enter mins: " );
    int m1 = keyboard.nextInt();
    Time t1 = new Time(h1, m1);

    System.out.println("Time 2" );
    System.out.print("Enter hours: " );
    int h2 = keyboard.nextInt();
    System.out.print("Enter mins: " );
    int m2 = keyboard.nextInt();
    Time t2 = new Time(h2, m2);

    System.out.println(t1 + " = " + t2 + "? " + t1.equals(t2));
    System.out.println(t2.elapsedSince(t1) + " minutes elapsed from t1 to t2.");
    
   int timeDiff = t1.compareTo(t2);
   if (timeDiff > 0) {
       System.out.println(t1 + " is " + timeDiff + " minutes after " + t2);
   } else if (timeDiff < 0 ) {
       System.out.println(t1 + " is " + (-timeDiff) + " minutes before " + t2);
   } else {
       System.out.println(t1 + " and " + t2 + " are the same time.");  
   }
   System.out.println("The t1 time is " + t1);
   t1.addMinutes(90);      // note that t1 is permanently changed
   System.out.println("90 minutes from t1 is " + t1);
   
   System.out.println("The t2 time is " + t2);
   Time t3 = t2.createTime(45);
   System.out.println("In 45 minutes from t2 is " + t3);
  }
}
