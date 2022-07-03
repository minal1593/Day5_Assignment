//Java Program to swap two Numbers
import java.util.*;
class SwapNumbers
{
    public static void main(String[] args)
    {
        int x, y, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        x = sc.nextInt();
        System.out.println("Enter the value of y : ");
        y = sc.nextInt();

        t = x;
        x = y;
        y = t;

        System.out.println("After swapping the value of  x is : "+x );

        System.out.println("After swapping the value of  y is : "+y );


    }
}