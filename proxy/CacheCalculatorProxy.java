package proxy;
import java.util.HashMap;
import java.util.Map;


public class CacheCalculatorProxy implements Calculator {

    private final RealCalculator realCalculator;

    private final Map<Integer, Long> cache;

    public CacheCalculatorProxy() {
        this.realCalculator = new RealCalculator();
        this.cache = new HashMap<>();
    }

    @Override
    public long compute(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        long result = realCalculator.compute(n);
        cache.put(n, result);

        return result;
    }
}

