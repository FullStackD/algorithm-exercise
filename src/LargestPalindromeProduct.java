/**
 * 479. Largest Palindrome Product
 *
 * @author Monster
 * @date 2017/10/25
 */
public class LargestPalindromeProduct {

    public int largestPalindrome(int n) {
        if (n == 1) {
            return 9;
        }
        int upperBound = (int) Math.pow(10, n) - 1, lowerBound = upperBound / 10;
        long maxNumber = (long) upperBound * (long) upperBound;
        int firstHalf = (int) (maxNumber / (long) Math.pow(10, n));
        boolean palindromFound = false;
        long palindrom = 0;
        while (!palindromFound) {
            palindrom = createPalindrom(firstHalf);
            for (long i = upperBound; upperBound > lowerBound; i--) {
                if (palindrom > maxNumber || i * i < palindrom) {
                    break;
                }
                if (palindrom % i == 0) {
                    palindromFound = true;
                    break;
                }
            }
            firstHalf--;
        }
        return (int) (palindrom % 1337);
    }

    private long createPalindrom(long num) {
        String str = num + new StringBuilder(Long.toString(num)).reverse().toString();
        return Long.parseLong(str);
    }

    public static void main(String[] args) {
        new LargestPalindromeProduct().largestPalindrome(3);
    }
}
