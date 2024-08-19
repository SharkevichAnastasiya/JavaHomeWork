package test.java;

import org.junit.jupiter.api.Test;
import src.main.java.Factorial;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, Factorial.calculateFactorial(0));
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, Factorial.calculateFactorial(5)); // 5! = 120
        assertEquals(720, Factorial.calculateFactorial(6)); // 6! = 720
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            Factorial.calculateFactorial(-1);
        });
    }
}