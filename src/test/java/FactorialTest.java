import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class FactorialTest {
    @Test
    void shouldReturnTheFactorialAs1When0isGiven() {
        Factorial factorial = new Factorial(0);
        int expectedValue = 1;
        int actualValue = factorial.getFactorial();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void shouldReturnTheFactorialAs1When1isGiven() {
        Factorial factorial = new Factorial(1);
        int expectedValue = 1;
        int actualValue = factorial.getFactorial();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void shouldReturnTheFactorialAs2When2isGiven() {
        Factorial factorial = new Factorial(2);
        int expectedValue = 2;
        int actualValue = factorial.getFactorial();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void shouldReturnFactorialAs6When3isGiven() {
        Factorial factorial = new Factorial(3);
        int expectedValue = 6;
        int actualValue = factorial.getFactorial();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void shouldReturnFactorialAs24When4isGiven() {
        Factorial factorial = new Factorial(4);
        int expectedValue = 24;
        int actualValue = factorial.getFactorial();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void shouldReturnFactorialAs120When5isGiven() {
        Factorial factorial = new Factorial(5);
        int expectedValue = 120;
        int actualValue = factorial.getFactorial();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void shouldReturnFactorialAs362990When10isGiven() {
        Factorial factorial = new Factorial(10);
        int expectedValue = 3628800;
        int actualValue = factorial.getFactorial();
        assertEquals(expectedValue, actualValue);
    }






}
