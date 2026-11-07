package proxy;

public class RealCalculator implements Calculator {
	@Override
    public long compute(int n) {
        return fibonacci(n);
    }

    private long fibonacci(int n) {
        if (n <= 1) {
            return n;             
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  
    }
}

