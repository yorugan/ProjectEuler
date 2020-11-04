package Level1;

/*
    The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143 ?
 */

public class LargestPrimeFactor
{
    public static void main(String[] args)
    {
        String n = "600851475143";
        primeFactor(Long.parseLong(n));
    }

    public static void primeFactor(long n)
    {
            while(n % 2 == 0)
            {
                System.out.println(2 + " ");
                n /= 2;
            }

            for(int i = 3; i <= Math.sqrt(n); i+=2)
            {
                while(n % i == 0)
                {
                    System.out.println(i + " ");
                    n /= i;
                }
            }

            if(n > 2)
                System.out.println(n);
    }

}

