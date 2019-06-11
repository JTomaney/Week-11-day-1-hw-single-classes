import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(50, 50);
    }

    @Test
    public void hasPaper(){
        assertEquals(50, printer.getSheets());
    }

    @Test
    public  void canPrint(){
        printer.print(2, 3);
        assertEquals(44, printer.getSheets());
    }

    @Test
    public void wontPrintIfNotEnoughPaper(){
        printer.print(5, 11);
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void hasToner(){
        assertEquals(50, printer.getToner());
    }

    @Test
    public void printingReducesToner(){
        printer.print(2, 5);
        assertEquals(40, printer.getToner());
    }

}
