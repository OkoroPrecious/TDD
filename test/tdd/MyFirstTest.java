package tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstTest {

    @Test
    public void additionTest() {
        Kata calculator = new Kata();
        int result = calculator.add(2, 6);
        assertEquals(8, result);


    }
    @Test
    public void subtractionTest(){
        Kata calculator = new Kata();
        int result = calculator.subtract(4, 2);
        assertEquals( 2, result);
    }
    @Test
    public void absoluteSubtractionTest(){
        Kata calculator = new Kata();
        int result = calculator.subtract(2, 4);
        assertEquals( 2, result);
    }
    @Test

    public void productTest(){
        Kata calculator = new Kata();
        int result = calculator.product(10, 4);
        assertEquals(40, result);
    }

    @Test
    public void quotientTest(){
        Kata calculator = new Kata();
        int result = calculator.quotient(10, 5);
        assertEquals( 2, result);
    }

    @Test
    public void quotientZeroTest(){
        Kata calculator = new Kata();
        int result = calculator.quotient(10, 0);
        assertEquals( 0, result);
    }

    //                                              PseudoCode:
    // Given that I am a student;
    // When I enter my student score;
    // Output grades as follows:
    //  If student score is greater and equal to 90, and student score is lesser than or equal to 100, out Grade A;
    //  If student score is greater and equal to 80, and student score is lesser than 90, output Grade B;
    //  If student score is greater and equal to 70, and student score is lesser than 80, output Grade C;
    //  If student score is greater and equal to 60, and student score is lesser than 70, output Grade D;
    //  If student score is lesser than 60, output Grade F.


     @Test
     public void studentGradeTest(){
        Kata myStudentGrade = new Kata();
        String StudentGrade = myStudentGrade.getGrade(92);
        assertEquals("Grade A", StudentGrade);
     }
    @Test
    public void studentGradeTest2(){
        Kata myStudentGrade = new Kata();
        String StudentGrade = myStudentGrade.getGrade(81);
        assertEquals("Grade B", StudentGrade);
    }
    @Test
    public void studentGradeTest3(){
        Kata myStudentGrade = new Kata();
        String StudentGrade = myStudentGrade.getGrade(73);
        assertEquals("Grade C", StudentGrade);
    }
    @Test
    public void studentGradeTest4() {
        Kata myStudentGrade = new Kata();
        String StudentGrade = myStudentGrade.getGrade(65);
        assertEquals("Grade D", StudentGrade);
    }
    @Test
    public void studentGradeTest5() {
        Kata myStudentGrade = new Kata();
        String StudentGrade = myStudentGrade.getGrade(58);
        assertEquals("Grade F", StudentGrade);
    }

}

















