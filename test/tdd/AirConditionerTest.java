package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void acOnTest(){
        //Given that I have an Ac
        AirConditioner cool = new AirConditioner();
        // When I turn it on
        cool.setOn(true);
        // Check that it is on
        assertTrue(cool.getOnValue());
    }
    @Test
    public void  acOffTest(){
        //Given that I have an Ac
        AirConditioner cool = new AirConditioner();
        // And my Ac is on
        cool.setOn(true);
        // When I turn it off
        cool.setOn(false);
        // Check that it is off
        assertFalse(cool.getOnValue());
    }
     @Test
     public void acTemperatureTest(){
        //Given that I have an Ac
         AirConditioner cool = new AirConditioner();
         //Given that my Ac is on
         cool.setOn(true);
         cool.setTemperature(16);
         cool.increaseTemperature();
         cool.increaseTemperature();
         assertEquals(18, cool.getTemperature());
     }
     @Test
    public void acDecreaseTemperatureTest(){
         //Given that I have an ac
         AirConditioner cool = new AirConditioner();
         //given that my ac is on
         cool.setOn(true);
         cool.setTemperature(16 );
         cool.decreaseTemperature();
         //check that my temperature has decreased
         assertEquals(16, cool.getTemperature());
     }
     @Test
    public void excessIncreaseTemperatureTest(){
        //Given that I have an ac
         AirConditioner cool = new AirConditioner();
         //Given that Ac is on
         cool.setOn(true);
         cool.setTemperature(30);
         cool.increaseTemperature();
         assertEquals(30, cool.getTemperature());

    }
    @Test
    public void excessDecreaseTemperatureTest(){
        //Given that I have an ac
        AirConditioner cool = new AirConditioner();
        //Given that Ac is on
        cool.setOn(true);
        cool.setTemperature(16);
        cool.decreaseTemperature();
        assertEquals(16, cool.getTemperature());

    }
}
