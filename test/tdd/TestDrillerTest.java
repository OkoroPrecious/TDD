package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDrillerTest {
    @Test
    public void TestDrillerTest1(){
        TestDriller calculator = new TestDriller();
        int pricePerUnit = calculator.noOfCopies(2);
        assertEquals(4000, pricePerUnit);
    }
    @Test
    public void TestDrillerTest2(){
        TestDriller calculator = new TestDriller();
        int pricePerUnit = calculator.noOfCopies(7);
        assertEquals(12600, pricePerUnit);
    }
    @Test
    public void TestDrillerTest3(){
        TestDriller calculator = new TestDriller();
        int pricePerUnit = calculator.noOfCopies(13);
        assertEquals(20800, pricePerUnit);
    }
    @Test
    public void TestDrillerTest4(){
        TestDriller calculator = new TestDriller();
        int pricePerUnit = calculator.noOfCopies(33);
        assertEquals(49500, pricePerUnit);
    }
    @Test
    public void TestDrillerTest5(){
        TestDriller calculator = new TestDriller();
        int pricePerUnit = calculator.noOfCopies(53);
        assertEquals(68900, pricePerUnit);
    }
    @Test
    public void TestDrillerTest6(){
        TestDriller calculator = new TestDriller();
        int pricePerUnit = calculator.noOfCopies(110);
        assertEquals(132000, pricePerUnit);
    }
    @Test
    public void TestDrillerTest7(){
        TestDriller calculator = new TestDriller();
        int pricePerUnit = calculator.noOfCopies(250);
        assertEquals(275000, pricePerUnit);
    }
    @Test
    public void TestDrillerTest8(){
        TestDriller calculator = new TestDriller();
        int pricePerUnit = calculator.noOfCopies(6000);
        assertEquals(6000000, pricePerUnit);
    }
}
