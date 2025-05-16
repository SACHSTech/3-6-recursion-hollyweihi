package recursion;

public class CheckIfAStringIsAPalindrome {
    public static boolean isPalindrome(String s) {

        // Base Case
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        // Recursive Case
        return isPalindrome(s.substring(1, (s.length() - 1)));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("HeooeH"));
        System.out.println(isPalindrome("adfkh"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("A"));
        System.out.println(isPalindrome("helloworlddlrowolleh"));
    }
}
