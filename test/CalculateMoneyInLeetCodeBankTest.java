import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateMoneyInLeetCodeBankTest {
    @Test
    public void testThatHercyKeptMoneyFor4Days(){
        int numberOfDays = 4;
        int expected = 10;
        assertEquals(expected,CalculateMoneyInLeetCodeBank.calculatorFunction(numberOfDays));
    }
    @Test
    public void testThatHercyKeptMoneyFor10Days(){
        int numberOfDays = 10;
        int expected = 37;
        assertEquals(expected,CalculateMoneyInLeetCodeBank.calculatorFunction(numberOfDays));
    }
    @Test
    public void testThatHercyKeptMoneyFor20Days(){
        int numberOfDays = 20;
        int expected = 96;
        assertEquals(expected,CalculateMoneyInLeetCodeBank.calculatorFunction(numberOfDays));
    }

}