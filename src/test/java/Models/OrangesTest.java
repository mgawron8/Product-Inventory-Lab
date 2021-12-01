package Models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrangesTest {

    @Test
    public void setidTest(){
        //given
        int expected = 1;
        //when
        Oranges testOrange = new Oranges();
        testOrange.setId(expected);
        //then
        Assertions.assertEquals(expected,testOrange.getId());
    }

    @Test
    public void setWeightinLbsTest(){
        //given
        Double expected = 3.4;
        //when
        Oranges testOrange = new Oranges();
        testOrange.setWeightinLbs(expected);
        //then
        Assertions.assertEquals(expected, testOrange.getWeightinLbs());
    }

    @Test
    public void setRipenessTest(){
        //given
        String expected = "Green";
        //when
        Oranges testOrange = new Oranges();
        testOrange.setRipeness(expected);
        //then
        Assertions.assertEquals(expected,testOrange.getRipeness());
    }

    @Test
    public void setPricePerLbsTest(){
        //given
        Double expected = 2.99;
        //when
        Oranges testOrange = new Oranges();
        testOrange.setPricePerLb(expected);
        //then
        Assertions.assertEquals(expected,testOrange.getPricePerLb());
    }

    @Test
    public void setAmountTest(){
        //given
        int expected = 4;
        //when
        Oranges testOrange = new Oranges();
        testOrange.setAmount(expected);
        //then
        Assertions.assertEquals(expected,testOrange.getAmount());
    }
}
