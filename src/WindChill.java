//Day3(BRP BATCH)............
//.....WINDCHILL PROGRAM.....

import java.util.Scanner;
public class WindChill
{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double Tempreture;
        System.out.println("Enter temperature in farenheit= ");
        Tempreture = sc.nextDouble();

        double WindSpeed;
        System.out.println("Enter the wind speed V = ");
        WindSpeed = sc.nextDouble();


        if (Tempreture <50 && (WindSpeed >=3 && WindSpeed <120))
        {

            double v = Math.pow(WindSpeed, 0.16);

            double WindChill = 35.74 + 0.6215 * Tempreture + (0.4275 * Tempreture - 35.75) * v;

            System.out.println("Windchill is = " +WindChill);
        }
        else
        {
            System.out.println("Input is invalid");

        }

        System.out.println( );

    }
}

