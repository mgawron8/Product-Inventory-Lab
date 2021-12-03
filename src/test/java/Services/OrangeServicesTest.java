package Services;


import Models.Orange;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class OrangeServicesTest {
    @Test
    public void createTest(){

        Double expectedWeight = 2.0;
        String expectedripeness = "Orange";
        Double expectedPrice = 2.0;
        int expectedAmount = 0;

        OrangeServices TestOrangeServices = new OrangeServices();
        Orange testOrange = OrangeServices.create(expectedAmount,
                expectedPrice,expectedripeness,expectedWeight);

        int actualId = testOrange.getId();
        Double actualWeight = testOrange.getWeightinLbs();
        String actualRipeness = testOrange.getRipeness();
        Double actualPrice = testOrange.getPricePerLb();
        int actualAmount = testOrange.getAmount();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedAmount,actualAmount);
        Assertions.assertEquals(expectedPrice,actualPrice);
        Assertions.assertEquals(expectedWeight,actualWeight);
        Assertions.assertEquals(expectedripeness,actualRipeness);
    }

    @Test
    public void findOrangeTest(){
        OrangeServices testOrangeServices = new OrangeServices();
        Orange testOrange = OrangeServices.create();

        Orange compareOrange = testOrangeServices.findOrange(0);

        Assertions.assertEquals(testOrange,compareOrange);
    }

    @Test
    public void findAllTest(){
        OrangeServices testOrangeServices = new OrangeServices();
        Orange testOrange = OrangeServices.create();
        Orange testOrange2 = OrangeServices.create();

        Orange[] oranges = testOrangeServices.findAll();
        Orange[] oranges2 = {testOrangeServices.findOrange(0),testOrangeServices.findOrange(1)};

        Assertions.assertTrue(Arrays.equals(oranges,oranges2));
    }

    @Test
    public void deleteOrangeTest(){
        OrangeServices testOrangeServices = new OrangeServices();
        Orange testOrange = OrangeServices.create();

        Assertions.assertTrue(testOrangeServices.delete(0));
    }


}
