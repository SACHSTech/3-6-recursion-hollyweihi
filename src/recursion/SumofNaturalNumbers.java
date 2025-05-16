package recursion;

public class SumofNaturalNumbers {
    public static int sum(int n) {
        // Base Case
        if (n <= 0) {
            return n;
        }

        // Recursive Case
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // Output: 15
        System.out.println(sum(0));
    }
}
