package recursion;

public class PowerFunction {
    public static int power(int base, int exponent){
        if(exponent == 0 ){
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    public static void main(String[] args){
        System.out.println(power(2, 3));
        System.out.println(power(1,6));
        System.out.println(power(0,5));
        System.out.println(power(45678, 0));
    }
}
