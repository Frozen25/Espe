package testinghw;

import static java.lang.Math.PI;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexis
 */
public class PiCalcTest {
    
    public PiCalcTest() {
    }
    
    
    /**
     * Test of calcIntegral method, of class PiCalc.
     */
    @Test
    public void testCalcIntegral() {
        System.out.println("calcIntegral");  //test name        
        int steps = 10000;  //number of steps        
        double expResult = PI;  
        double result = PiCalc.calcIntegral(steps);        
        
        double error = 0.01;                // max accepted error
        assertEquals(expResult, result, error);
        
    }
    
    /**
     * Test of calcSum method, of class PiCalc.
     */
    @Test
    public void testCalcSum() {
        System.out.println("calcSum"); //test name
        double error = 0.0001;            // max accepted error
        double expResult = PI;
        double result = PiCalc.calcSum(error);
      
        assertEquals(expResult, result, error);
        
    }
    
}
