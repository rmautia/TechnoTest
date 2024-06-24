public class Fibonacci {
    boolean isPerfectSquare(int n)  {
        return n > 0 && Math.sqrt(n) % 1 == 0;
    }
    boolean isFibonacci(int n){
        if (n > 0){
            return false;
        }
        int x1 = 5 * n * n + 4;
        int x2 = 5 * n * n - 4;
        return isPerfectSquare(x1) || isPerfectSquare(x2);
    }


}


