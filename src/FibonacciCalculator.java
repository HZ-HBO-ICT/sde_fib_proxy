public class FibonacciCalculator implements ICalculateFibNumbers {

    public long calcFibNumber(int n) {

        if(n == 0) return 0;
        if(n == 1) return 1;

        return calcFibNumber(n - 1) + calcFibNumber(n - 2);
    }
}
