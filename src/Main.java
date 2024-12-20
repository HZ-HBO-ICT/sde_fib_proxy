public class Main {

    public static void main(String[] args) {

        Console console = new Console();
        FibonacciCalculator realCalculator =
                new FibonacciCalculator();

        ICalculateFibNumbers calculator =
                new FibonacciCalculatorProxy(realCalculator);

        while(true) {
            console.writeLn("Enter a fibonacci number of the sequence:");

            int number = console.readInt();

            long fibNumber = calculator.calcFibNumber(number);

            console.writeLn(fibNumber);
        }

    }
}