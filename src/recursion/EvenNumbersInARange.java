package recursion;

public class EvenNumbersInARange {
    public static void printEvens(int start, int end) {

        // Base Case
        if (start > end) {
            return;
        }

        // Recursive Case
        if (start % 2 == 0) { // Even number need to have a remainder of 0.
            System.out.println(start);
        }

        printEvens(start + 1, end);
    }

    public static void main(String[] args) {
        printEvens(2, 10);
        printEvens(-3, 13);
    }
}
