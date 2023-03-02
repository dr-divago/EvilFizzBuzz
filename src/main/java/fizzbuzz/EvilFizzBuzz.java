package fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvilFizzBuzz {
    public String generate(IntStream intStream) {
        StringBuilder sb = new StringBuilder();
        return intStream.boxed().map(this::generate).collect(Collectors.joining(", "));
    }

    public String generate(int i) {
        StringBuilder sb = new StringBuilder();
        boolean divisibleBy3 = isDivisibleByN(i, 3);
        boolean divisibleBy5 = isDivisibleByN(i, 5);
        boolean isPrime = isPrime(i);

        if (!divisibleBy3 && !divisibleBy5 && !isPrime)
            return String.valueOf(i);

        if (divisibleBy3) {
            sb.append("Fizz");
        }
        if (divisibleBy5) {
            sb.append("Buzz");
        }

        if (isPrime(i))
            sb.append("Wizz");

        return sb.toString();
    }

    private boolean isDivisibleByN(int n, int d ) {
        return (n % d == 0);
    }

    private boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
