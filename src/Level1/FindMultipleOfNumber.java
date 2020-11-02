package Level1;

import java.util.Scanner;

/*
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

    Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class FindMultipleOfNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sum = SumDivisibleBy(3, number) + SumDivisibleBy(5, number) - SumDivisibleBy(15, number);
        System.out.println(sum);

//        int sum = 0;
//
//        for(int i = 0; i < number; i++)
//        {
//            if(i%3 == 0 || i%5 == 0)
//            {
//                sum += i;
//            }
//        }
//
//        System.out.println(sum);
    }

    public static int SumDivisibleBy(int n, int number)
    {
        int sum = 0;
        for (int i = 0; i < number; i++)
        {
            if (i % n == 0)
            {
                sum += i;
            }
        }

        return sum;
    }
}
