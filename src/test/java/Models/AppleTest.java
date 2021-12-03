package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppleTest {
    @Test
    public void setidTest(){
        //given
        int expected = 1;
        //when
        Apple testApple = new Apple();
        testApple.setId(expected);
        //then
        Assertions.assertEquals(expected, testApple.getId());
    }

    @Test
    public void setWeightinLbsTest(){
        //given
        Double expected = 3.4;
        //when
        Apple testApple = new Apple();
        testApple.setWeightinLbs(expected);
        //then
        Assertions.assertEquals(expected, testApple.getWeightinLbs());
    }

    @Test
    public void setRipenessTest(){
        //given
        String expected = "Green";
        //when
        Apple testApple = new Apple();
        testApple.setRipeness(expected);
        //then
        Assertions.assertEquals(expected, testApple.getRipeness());
    }

    @Test
    public void setPricePerLbsTest(){
        //given
        Double expected = 2.99;
        //when
        Apple testApple = new Apple();
        testApple.setPricePerLb(expected);
        //then
        Assertions.assertEquals(expected, testApple.getPricePerLb());
    }

    @Test
    public void setAmountTest(){
        //given
        int expected = 4;
        //when
        Apple testApple = new Apple();
        testApple.setAmount(expected);
        //then
        Assertions.assertEquals(expected, testApple.getAmount());
    }

    @Test
    public void AppleConstructorTest(){
        //given
        int expectedid = 1;
        Double expectedWeight = 3.5;
        String expectedRipeness = "Red";
        Double expectedPrice = 4.0;
        int expectedAmount = 4;
        //when
        Apple test = new Apple(expectedid,expectedWeight,
                expectedRipeness,expectedPrice,expectedAmount);
        //then
        Assertions.assertEquals(expectedid,test.getId());
        Assertions.assertEquals(expectedWeight, test.getWeightinLbs());
        Assertions.assertEquals(expectedRipeness, test.getRipeness());
        Assertions.assertEquals(expectedPrice, test.getPricePerLb());
        Assertions.assertEquals(expectedAmount, test.getAmount());
    }
}
