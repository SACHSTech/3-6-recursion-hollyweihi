package recursion;

public class SumOfDigit {
    public static int sumOfDigit(int n){
        if(n ==0){
            return n;
        }

        return (n % 10) + sumOfDigit(n/10); 
    }
}
