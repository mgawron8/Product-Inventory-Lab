package Services;

import Models.Apple;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class AppleServicesTest {
    @Test
    public void createTest(){


        Double expectedWeight = 2.0;
        String expectedripeness = "Red";
        Double expectedPrice = 2.0;
        int expectedAmount = 0;

        AppleServices TestAppleServices = new AppleServices();
        Apple testApple = AppleServices.create(expectedAmount,
                expectedPrice,expectedripeness,expectedWeight);

        int actualId = testApple.getId();
        Double actualWeight = testApple.getWeightinLbs();
        String actualRipeness = testApple.getRipeness();
        Double actualPrice = testApple.getPricePerLb();
        int actualAmount = testApple.getAmount();

        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedAmount,actualAmount);
        Assertions.assertEquals(expectedPrice,actualPrice);
        Assertions.assertEquals(expectedWeight,actualWeight);
        Assertions.assertEquals(expectedripeness,actualRipeness);
    }

    @Test
    public void findAppleTest(){
        AppleServices testAppleServices = new AppleServices();
        Apple testApple = AppleServices.create();

        Apple compareApple = testAppleServices.findApple(0);

        Assertions.assertEquals(testApple,compareApple);
    }

    @Test
    public void findAllTest(){
        AppleServices testAppleServices = new AppleServices();
        Apple testApple = AppleServices.create();
        Apple testApple2 = AppleServices.create();

        Apple[] apples = testAppleServices.findAll();
        Apple[] apples2 = {testAppleServices.findApple(0),testAppleServices.findApple(1)};

        Assertions.assertTrue(Arrays.equals(apples,apples2));
    }

    @Test
    public void deleteAppleTest(){
        AppleServices testAppleServices = new AppleServices();
        Apple testApple = AppleServices.create();

        Assertions.assertTrue(testAppleServices.delete(0));
    }


}
