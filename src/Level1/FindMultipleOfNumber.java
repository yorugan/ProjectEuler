package Level1;

import java.util.Scanner;

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
