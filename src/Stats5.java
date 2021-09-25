
////Day3(BRP BATCH)............
////.....Stats5.....

import java.util.Random;
import java.util.Scanner;
public class Stats5
{
    public static void main(String[] args) {

        int n = 5;

        Random random = new Random();

        double N1 = (double)random.nextDouble();
        double N2 = (double)random.nextDouble();
        double N3 = (double)random.nextDouble();
        double N4 = (double)random.nextDouble();
        double N5 = (double)random.nextDouble();


        double average = N1 + N2 + N3 + N4 + N5 / n;

        System.out.println("Average of five random numbers are = " +average);

    }

}

