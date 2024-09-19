import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Sci_Calc_Test {

    // Test for the square root function
    @Test
    public void testSquareRoot() {
        assertEquals(4.0, ScientificCalculator.squareRoot(16), 0.001);
        assertEquals(5.0, ScientificCalculator.squareRoot(25), 0.001);
        assertThrows(IllegalArgumentException.class, () -> {
            ScientificCalculator.squareRoot(-9);
        });
    }

    // Test for the factorial function
    @Test
    public void testFactorial() {
        assertEquals(120, ScientificCalculator.factorial(5));
        assertEquals(1, ScientificCalculator.factorial(0)); // Factorial of 0 is 1
        assertEquals(1, ScientificCalculator.factorial(1)); // Factorial of 1 is 1
    }

    // Test for natural logarithm (ln(x)) function
    @Test
    public void testNaturalLog() {
        assertEquals(0.0, ScientificCalculator.naturalLog(1), 0.001); // ln(1) = 0
        assertEquals(1.0, ScientificCalculator.naturalLog(Math.E), 0.001); // ln(e) = 1
        assertThrows(IllegalArgumentException.class, () -> {
            ScientificCalculator.naturalLog(0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            ScientificCalculator.naturalLog(-5);
        });
    }

    // Test for the power function
    @Test
    public void testPower() {
        assertEquals(8.0, ScientificCalculator.power(2, 3), 0.001); // 2^3 = 8
        assertEquals(1.0, ScientificCalculator.power(5, 0), 0.001); // Any number to the power 0 is 1
        assertEquals(0.25, ScientificCalculator.power(2, -2), 0.001); // 2^-2 = 0.25
    }
}
