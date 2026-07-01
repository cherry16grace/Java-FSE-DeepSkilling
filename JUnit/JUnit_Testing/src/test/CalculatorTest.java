import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Teardown completed");
    }

    @Test
    void testAdd() {

        
        int a = 10;
        int b = 20;

        
        int result = calculator.add(a, b);

        
        assertEquals(30, result);
    }
}