import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    void shouldReturnTheFactorialOf0As1() {
        Factorial factorial = new Factorial(0);
        int expectedValue = 1;
        int actualValue = factorial.getFactorial();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void shouldReturnTheFactorialOf1As1() {
        Factorial factorial = new Factorial(1);
        int expectedValue = 1;
        int actualValue = factorial.getFactorial();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void shouldReturnTheFactorialOf2As2() {
        Factorial factorial = new Factorial(2);
        int expectedValue = 2;
        int actualValue = factorial.getFactorial();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void shouldReturnFactorialOf3As6() {
        Factorial factorial = new Factorial(3);
        int expectedValue = 6;
        int actualValue = factorial.getFactorial();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void shouldReturnFactorialOf4As24() {
        Factorial factorial = new Factorial(4);
        int expectedValue = 24;
        int actualValue = factorial.getFactorial();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void shouldReturnFactorialOf5As120() {
        Factorial factorial = new Factorial(5);
        int expectedValue = 120;
        int actualValue = factorial.getFactorial();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void shouldReturnFactorialOf10As3628800() {
        Factorial factorial = new Factorial(10);
        int expectedValue = 3628800;
        int actualValue = factorial.getFactorial();
        assertEquals(expectedValue, actualValue);
    }






}
