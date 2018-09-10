package recursiv;

public class Factorial {

    public static int factorialRecursiv(int n) throws IllegalArgumentException {
        if(n < 0)
            throw new IllegalArgumentException();  // arg exception for non negative values
        else if(n == 0)
            return 1;   // base case
        else
            return n * factorialRecursiv(n - 1);   // recursive call
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorialRecursiv(n));
    }
}
