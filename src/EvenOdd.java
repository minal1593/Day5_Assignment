//Java Program to wheather the number is even or odd
import java.util.Scanner;

class EvenOdd
{
    public static void main(String args[])
    {
        int n;
        System.out.println("Enter the  number to check:");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        /* If number is divisible by 2 then it's an even number
         * else odd number*/
        if ( n % 2 == 0 )
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}