package test.java;

import org.junit.jupiter.api.Test;
import src.main.java.Factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FactorialTest {
    @Test
    public void testFactorialOfZero() {
        assertEquals(Factorial.calculateFactorial(0), 1);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(Factorial.calculateFactorial(5), 120); // 5! = 120
        assertEquals(Factorial.calculateFactorial(6), 720); // 6! = 720
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            Factorial.calculateFactorial(-1);
        });
    }
}