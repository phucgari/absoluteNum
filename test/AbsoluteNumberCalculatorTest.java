import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void findAbsolute0() {
        int num=0;
        int expected=0;

        int result=AbsoluteNumberCalculator.findAbsolute(num);
        assertEquals(expected,num);
    }
    @Test
    void findAbsolute4(){
        int num=4;
        int expected=4;

        int result=AbsoluteNumberCalculator.findAbsolute(num);
        assertEquals(expected,result);
    }
    @Test
    void findAbsolute3(){
        int num=3;
        int expected=3;

        int result=AbsoluteNumberCalculator.findAbsolute(num);
        assertEquals(expected,result);
    }
    @Test
    void findAbsoluteMinus2(){
        int num=-2;
        int expected=2;

        int result=AbsoluteNumberCalculator.findAbsolute(num);
        assertEquals(expected,result);
    }
    @Test
    void findAbsoluteMinus3(){
        int num=-3;
        int expected=3;

        int result=AbsoluteNumberCalculator.findAbsolute(-3);
        assertEquals(expected,result);
    }
}