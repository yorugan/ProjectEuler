package Level1;

public class LargestPalindromeProduct
{
    /*
        A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

        Find the largest palindrome made from the product of two 3-digit numbers.
     */

    public static void main(String[] args)
    {
        int n = 1000;
        int largestPalindrome = 0;

        for (int i = 1; i < n; i++)
        {
            for (int j = 1; j < n; j++)
            {
                int k = i * j;
                if (isPalindrome(Integer.toString(k)))
                {
                    if(largestPalindrome < k)
                    {
                        largestPalindrome = k;
                    }
                }
            }

        }
        System.out.println(largestPalindrome);
        System.out.println(findNumberOfPalindrome(100));
    }

    public static boolean isPalindrome(String word)
    {
        String reversedString = "";
        word = word.replaceAll("\\s+", "").toLowerCase(); // removes white spaces input so we can check for palindrome

        for (int i = word.length() - 1; i >= 0; i--)
        {
            reversedString = reversedString + word.charAt(i);
        }
        if (word.equals(reversedString))
        {
            return true;
        } else
        {
            return false;
        }
    }

    public static int findNumberOfPalindrome(int n)
    {
        int count = 0;
        for (int i = 10; i < n; i++)
        {
            if (isPalindrome(Integer.toString(i)))
            {
                count++;
            }
        }

        return count;
    }


}
