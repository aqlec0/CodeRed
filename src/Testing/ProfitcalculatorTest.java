package Testing;

import Testing.Profitcalculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProfitcalculatorTest {

    @Test
    public void testCalculator(){

        Profitcalculator calculator = new Profitcalculator();
        int [] testArray = {1,2,3};
        //assertEquals(6,calculator.calculate(testArray));

        int [] testArray1 = {10,0,60};
        //assertEquals(6,calculator.calculate(testArray1));

        int [] testArray2 = {-100,0,60};
        assertEquals(6,calculator.calculate(testArray2));
    }

}
