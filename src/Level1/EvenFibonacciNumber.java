package Level1;

import java.math.BigInteger;
import java.util.Scanner;

public class EvenFibonacciNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numberLimit = scanner.nextInt();
        int sum = 0;

        for (int i = 2; i < numberLimit; i++)
        {
            if (fibonacciTabular(i) % 2 == 0)
            {
                sum += fibonacciTabular(i);
            }
        }

        System.out.println(sum);

    }

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
    //Equation for fibonacci is:
    //xn = xn-1 + xn-2
    //bottom-up algorithm to reduce time
}
