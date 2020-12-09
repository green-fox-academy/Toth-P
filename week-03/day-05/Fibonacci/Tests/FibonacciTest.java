import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void testFibonacci2ndNumber() {

        int expected = 1;
        int actual = Fibonacci.fibonacciNth(2);
        assertEquals(expected, actual);

    }

    @Test
    public void testFibonacciIndex14() {

        int expected = 377;
        int actual = Fibonacci.fibonacciNth(14);
        assertEquals(expected, actual);

    }

    @Test
    public void testFibonacciNegativeIndex() {

        int expected = 0;
        int actual = Fibonacci.fibonacciNth(-2);
        assertEquals(expected, actual);

    }


    @Test(expected = StackOverflowError.class)
    public void testFibonacciIndexMaxValue() {
        Fibonacci.fibonacciNth(Integer.MAX_VALUE);


    }

}