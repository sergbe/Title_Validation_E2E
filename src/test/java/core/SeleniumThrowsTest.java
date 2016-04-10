package core;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;


import org.junit.BeforeClass;
import org.junit.ComparisonFailure;
import org.junit.Test;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class SeleniumThrowsTest {



    @BeforeClass
    public static void BeforeClass01() throws Exception {
    }



    // Test data generator
    @Parameters(name = "Iteration # {index} : exp: {1}; act: {2}")
    public static Collection<String[]> data() throws IOException {
        core.SeleniumThrows selenuim = new core.SeleniumThrows();
        return Arrays.asList(selenuim.a2d());
    }

    //Parameter for fields injection instead of Constructor
    @Parameter(value = 0)
    public String test_id;

    @Parameter(value = 1)
    public String expectedResult;

    @Parameter(value = 2)
    public String realResult;

    @Test
    public void testTitleValidation() throws ComparisonFailure{
//	System.out.println("Test Case: "+test_id+ " -> Expected Result: "+expectedResult+ " -> Actual Result: "+realResult);
        assertEquals("FAILED",expectedResult,realResult);

    }

}
