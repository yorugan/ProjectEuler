package Level1;

import java.math.BigInteger;
import java.util.Scanner;

/*
    Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

    1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

    By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */

public class EvenFibonacciNumber
{
    private static int LIMIT = 4_000_000;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        setLIMIT(scanner.nextInt());

        System.out.println(fibonacci(LIMIT));
        System.out.println(fibonacci2(LIMIT));
//        System.out.println(System.currentTimeMillis());
    }

    public static long fibonacci(int n)
    {
        int fibonacci1 = 1;
        int fibonacci2 = 2;
        long sum = 0;

        while(fibonacci2 <= n)
        {
            int fibonacci3;
            sum += fibonacci2;
            fibonacci3 = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2 + fibonacci3;
            fibonacci2 = fibonacci1 + fibonacci3;

            //skips odd number sequence of fibonacci
        }

        return sum;
    }

    public static long fibonacci2(int n)
    {
        int fibonacci1 = 0;
        int fibonacci2 = 2;
        long sum = fibonacci1 + fibonacci2;

        while (sum <= n)
        {
            int tempfib = 4 * fibonacci2 + fibonacci1;
            sum = sum + tempfib;
            fibonacci1 = fibonacci2;
            fibonacci2 = tempfib;

            //skips odd number sequence of fibonacci
            // xn = 4k + j. xn being next iteration, k being current iteration, j being previous iteration
        }
        return sum;
    }


    // bottom-up algorithm to reduce time
    public static int fibonacciTabular(int n)
    {
        int[] fibonacci = new int[n + 1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i <= n; i++)
        {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci[n];
    }

    public static int getLIMIT()
    {
        return LIMIT;
    }

    public static void setLIMIT(int LIMIT)
    {
        EvenFibonacciNumber.LIMIT = LIMIT;
    }

    //Equation for fibonacci is:
    //xn = xn-1 + xn-2

}
