package recursion;

public class EvenNumbersInARange {
    public static void printEvens(int start, int end){
        if(start > end){
            return;
        }
        if(start %2 ==0){
            System.out.println(start);
        }

    }
}
