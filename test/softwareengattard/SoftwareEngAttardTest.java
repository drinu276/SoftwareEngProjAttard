package softwareengattard;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SoftwareEngAttardTest {
    
    public SoftwareEngAttardTest() {
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

    /**
     * Test of main method, of class SoftwareEngAttard.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SoftwareEngAttard.main(args);
    }

    /**
     * Test of retNum method, of class SoftwareEngAttard.
     */
    @Test
    public void testRetNum() {
        System.out.println("retNum");
        SoftwareEngAttard instance = new SoftwareEngAttard();
        int expResult = 5;
        int result = instance.retNum();
        assertEquals(expResult, result);
    }
    
}
