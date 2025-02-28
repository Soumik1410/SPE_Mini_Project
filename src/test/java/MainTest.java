package org.soumik;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MainTest {
    private final Main calculator = new Main();
    @Test
    public void testCalculateSquareRoot() {
        assertEquals(3.0, calculator.square_root((float)9.0), 0.001);
    }
    @Test
    public void testCalculateFactorial() {
        assertEquals(120, calculator.factorial(5));
    }
    @Test
    public void testCalculateNaturalLog() {
        assertEquals(Math.log(2.73), calculator.natural_log((float)2.73), 0.001);
    }
    @Test
    public void testCalculatePower() {
        assertEquals(25.0, (float)calculator.power(5, 2), 0.001);
    }
}

