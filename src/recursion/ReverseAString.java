package recursion;

public class ReverseAString {
    public static String reverse(String s) {
        // Base Case
        if (s.isEmpty()) {
            return s;
        }
        // Recursive Case
        return reverse(s.substring(1)) + (s.charAt(0));
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
        System.out.println(reverse(""));
        System.out.println(reverse("Hello World!"));
    }
}
