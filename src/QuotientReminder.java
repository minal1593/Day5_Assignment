//Java Program to Compute Quotient and Remainder
import java.util.Scanner;

class QuotientReminder
{


    public static void main (String[] args)
    {
        int quotient,remainder;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1(Dividend)");
        int num1 = sc.nextInt();
        System.out.println("Enter the value num2(Divisor)");
        int num2 = sc.nextInt();

        quotient = num1 / num2;
        remainder = num1 % num2;

        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
    }
}