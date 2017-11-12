package numbers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Félix Manuel
 */
public class NumberTest {
    
    public NumberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void equivalentsFractions(){
        Fraction fraction1 = new Fraction(3, 2);
        Fraction fraction2 = new Fraction(6, 4);
        
        boolean result = fraction1.equivalents(fraction2);
        assertTrue(result);
    }
    
    @Test 
    public void staticEquivalentsFractions(){        
        Fraction fraction1 = new Fraction(3, 2);
        Fraction fraction2 = new Fraction(6, 4);
        
        boolean result = Fraction.equivalents(fraction1, fraction2);
        assertTrue(result);
    }
    
    @Test
    public void isReduceFraction(){
        Fraction fraction1 = new Fraction(3,2);
        
        boolean result = fraction1.isReduce();
        assertFalse(result);
    }
    
    @Test
    public void irreducibleFraction(){
        Fraction fraction1 = new Fraction(10,5);
        
        Fraction result = fraction1.irreducible();
        assertEquals(new Fraction(2,1), result);
    }
}
