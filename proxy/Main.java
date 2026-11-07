package proxy;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new CacheCalculatorProxy();

        System.out.println("Первый вызов compute(40)");
        long start1 = System.currentTimeMillis();
        long result1 = calc.compute(40);
        long end1 = System.currentTimeMillis();
        System.out.println("Результат: fib(40) = " + result1 + ", время выполнения: " + (end1 - start1) + " мс\n");

        System.out.println("Второй вызов compute(40)(результат уже должен быть записан в Cache)");
        long start2 = System.currentTimeMillis();
        long result2 = calc.compute(40);
        long end2 = System.currentTimeMillis();
        System.out.println("Результат: fib(40) = " + result2 + ", время выполения: " + (end2 - start2) + " мс\n");

    }
}