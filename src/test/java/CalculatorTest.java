import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void canAddTwoNumbers(){
    assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void canSubtractTwoNumbers(){
        assertEquals(6, calc.sub(10, 4));
    }

    @Test
    public void canMultiplyTwoNumbers(){
        assertEquals(20, calc.multi(4, 5));
    }

    @Test
    public void canDivideTwoNumbers(){
        assertEquals(2, calc.div(8, 4));
    }


}
