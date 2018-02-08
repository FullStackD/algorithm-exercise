package leetcode;

public class PalindromeNumber {


    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int rev = 0;
        while (x > rev) {//只比较一半，不会出现溢出
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return x == rev || x == rev / 10;
    }

}
