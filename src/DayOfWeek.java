//Day3(BRP BATCH)............
//.....DayOfWeek program.....
import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("---------Finding the day of week--------\n");



        System.out.println("Enter the date :  ");
        int date =sc.nextInt();


        System.out.println("Enter the Month:  ");
        int month = sc.nextInt();

        if ((date >= 1 && date <= 31) && (month >= 1 && month <= 12))
        {


            System.out.println("Enter the Year : ");
            int year = sc.nextInt();

            int year1 = (year - (14 - month) / 12);
            int x = (year1 + year1 / 4 - year1 / 100 + year1 / 400);  //checking leap year
            int month1 = (month + 12 * ((14 - month) / 12) - 2);

            int day = ((date + x + 31 * month1 / 12) % 7);

            switch (day)
            {
                case 0:
                    System.out.println("Sunday");
                    break;

                case 1:
                    System.out.println("Monday");
                    break;

                case 2:
                    System.out.println("Tuesday");
                    break;

                case 3:
                    System.out.println("Wednesday");
                    break;

                case 4:
                    System.out.println("Thursday");
                    break;

                case 5:
                    System.out.println("Friday");
                    break;

                case 6:
                    System.out.println("Saturday");
                    break;

            }
        }
        else
        {
            System.out.println("Input is not valid");

        }
        System.out.println();
    }
}





