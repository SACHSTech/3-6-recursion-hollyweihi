package recursion;

public class SumOfDigit {
    public static int sumOfDigit(int n){
        // Base Case
        if(n ==0){
            return n;
        }

        // Recursive Case
        return (n % 10) + sumOfDigit(n/10); 
    }

    public static void main(String[] args){
        System.out.println(sumOfDigit(1234));
    }
}
