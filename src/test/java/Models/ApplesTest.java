package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplesTest {
    @Test
    public void setidTest(){
        //given
        int expected = 1;
        //when
        Apples testApples = new Apples();
        testApples.setId(expected);
        //then
        Assertions.assertEquals(expected,testApples.getId());
    }

    @Test
    public void setWeightinLbsTest(){
        //given
        Double expected = 3.4;
        //when
        Apples testApples = new Apples();
        testApples.setWeightinLbs(expected);
        //then
        Assertions.assertEquals(expected, testApples.getWeightinLbs());
    }

    @Test
    public void setRipenessTest(){
        //given
        String expected = "Green";
        //when
        Apples testApples = new Apples();
        testApples.setRipeness(expected);
        //then
        Assertions.assertEquals(expected,testApples.getRipeness());
    }

    @Test
    public void setPricePerLbsTest(){
        //given
        Double expected = 2.99;
        //when
        Apples testApples = new Apples();
        testApples.setPricePerLb(expected);
        //then
        Assertions.assertEquals(expected,testApples.getPricePerLb());
    }

    @Test
    public void setAmountTest(){
        //given
        int expected = 4;
        //when
        Apples testApples = new Apples();
        testApples.setAmount(expected);
        //then
        Assertions.assertEquals(expected,testApples.getAmount());
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
        Apples test = new Apples(expectedid,expectedWeight,
                expectedRipeness,expectedPrice,expectedAmount);
        //then
        Assertions.assertEquals(expectedid,test.getId());
        Assertions.assertEquals(expectedWeight, test.getWeightinLbs());
        Assertions.assertEquals(expectedRipeness, test.getRipeness());
        Assertions.assertEquals(expectedPrice, test.getPricePerLb());
        Assertions.assertEquals(expectedAmount, test.getAmount());
    }
}
