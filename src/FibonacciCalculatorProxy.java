import java.util.HashMap;

public class FibonacciCalculatorProxy implements ICalculateFibNumbers {

    private FibonacciCalculator _service;

    private HashMap<Integer, Long> _cachedValues;

    public FibonacciCalculatorProxy(FibonacciCalculator service) {
        this._service = service;
        this._cachedValues = new HashMap<>();

        // add predefined values
        this._cachedValues.put(0, 0L);
    }

    public long calcFibNumber(int n) {

        // check if the number is already stored
        if(! this._cachedValues.containsKey(n)) {

            long number = this._service.calcFibNumber(n);

            this._cachedValues.put(n, number);
        }

        long number = this._cachedValues.get(n);

        return number;
    }
}
