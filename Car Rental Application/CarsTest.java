

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CarsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CarsTest
{
    /**
     * Default constructor for test class CarsTest
     */
    public CarsTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void smallCar() throws Exception
    {
        smallCar smallCar1 = new smallCar();
    }

    @Test
    public void largeCar() throws Exception
    {
        largeCar largeCar1 = new largeCar();
    }

    @Test
    public void singletonString() throws Exception
    {
        smallCar smallCar1 = new smallCar();
        assertNotNull(smallCar1.getRegistration());
        largeCar largeCar1 = new largeCar();
        assertNotNull(largeCar1.getRegistration());
    }

    @Test
    public void addFuelCheckFalse() throws Exception
    {
        smallCar smallCar1 = new smallCar();
        smallCar1.addFuel(60);
        assertEquals(false, smallCar1.getTankFull());
    }
    
    @Test
    public void addFuelCheckTrue() throws Exception
    {
        smallCar smallCar1 = new smallCar();
        smallCar1.addFuel(49);
        assertEquals(true, smallCar1.getTankFull());
    }
}





