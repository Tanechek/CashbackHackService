package ru.netology.service;


import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void aboveBoundary (){
        int actualValue = service.remain(1200);
        int expectedValue = 800;
        Assert.assertEquals(actualValue, expectedValue);
    }
    @Test
    public void belowBoundary (){
        int actualValue = service.remain(700);
        int expectedValue = 300;
        Assert.assertEquals(actualValue, expectedValue);
    }
    @Test
    public void equalsBoundary(){
        int actualValue = service.remain(1000);
        int expectedValue = 0;
        Assert.assertEquals(actualValue, expectedValue);
    }

}