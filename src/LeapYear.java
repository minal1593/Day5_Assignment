//Program to check whether the given year is leap year or not
import java.util.Scanner;
public class LeapYear
{
    public static void main(String[] args)
    {
        int year;
        System.out.println("Enter an Year to Check:: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("The Given Year is a Leap Year");
        else
            System.out.println("The Given Year is not a Leap Year");
    }
}