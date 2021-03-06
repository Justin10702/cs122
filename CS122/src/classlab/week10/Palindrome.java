package classlab.week10;

public class Palindrome {

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) // Base case
            return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1)) // Base case
            return false;
        else
            return isPalindrome(s.substring(1, s.length() - 1));
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("qwertyuiopasdfghjklzxcvbnmnbvcxzlkjhgfdsapoiuytrewq"));
    }
}

