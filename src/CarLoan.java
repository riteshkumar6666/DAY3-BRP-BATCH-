
//Day3(BRP BATCH)............
//.....CAR LOAN PROGRAM.....
import java.util.Scanner;
public class CarLoan {
    public static void main(String[] args) {
        double year, Rate, Principal;
        Scanner sc=new Scanner(System.in);

        System.out.println(" EMI Calculation the monthly payment of a car");
        System.out.println("Enter Principal loan amount = ");
        Principal = sc.nextDouble();


        System.out.println("Enter years = ");
        year = sc.nextDouble();

        System.out.println("Enter rate percent = ");
        Rate = sc.nextDouble();
        double n = 12 * year;   //number of months
        double r = Rate / (12 * 100);  //interest rate

        double Monthlypayment = (Principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);

        System.out.println("Monthly payments is   : " + Monthlypayment);



    }
}
