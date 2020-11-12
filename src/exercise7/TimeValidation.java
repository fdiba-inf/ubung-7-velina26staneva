package exercise7;

import java.util.Scanner;

public class TimeValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = input.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();

        boolean timeValid = false; 
        areHoursValid(hours);
        areMinutesValid(minutes);
        if (areHoursValid(hours) && areMinutesValid(minutes)) {
          timeValid = true;
        }
        System.out.println("Time valid: " + timeValid);
    }


    public static boolean areHoursValid(int hours) {
      boolean areHoursValid = (hours > 1 && hours <=24);
      if (areHoursValid) {
        areHoursValid = true;

      } else {
        areHoursValid = false;
      
      }
      return areHoursValid;
    }


    public static boolean areMinutesValid(int minutes) {
        boolean areMinutesValid = (minutes > 1 && minutes <=60 );
        if (areMinutesValid ) {
         areMinutesValid = true;
    
        } else {
         areMinutesValid = false;
          
        }
        return areMinutesValid;
    }
}
