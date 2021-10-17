package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString()            //Test Empty String Function 
	{
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber()          //Test OnE Number function it evaluate to adding one number for calculator.add("1")
	{
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers()         //Test two Number method it accepting two number for calculator .add(1,2)
	{
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
    public void testThreeNumbers()           //Test three number method which is returning three number for calculator.add("1,2,3") 
    {
    	assertEquals(6, Calculator.add("1,2,3"));
    }

    @Test
    public void testNewLine()             //This menthod which is use for the testNewLine() ,whene the user enter the \n or ("1\n2,3") then it will calculator.add(("1\n2,3"))
    {
    	assertEquals(6, Calculator.add("1\n2,3"));
    }

    @Test
    public void testNegativeNumver         //This method which is use for the whene user entering NegativeNumver  then we developed this logic and also handling risky code with the help of try catch {} block , we hand
    {
    	try {
			Calculator.add("-1,2");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -1");
		}

		try {
			Calculator.add("2,-4,3,-5");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
		}
    }

    @Test
    public void testOverThousand()               //This method which is use for the test over thousand();
    {
    	assertEquals(2, Calculator.add("1000,2"));
    }

    @Test
    public void testOtherDelimiter()              //This method is use for the test other Delimiter ,whenever user call or add ("//;\n1;2") then it will calculate delimiter
    {
    	assertEquals(3, Calculator.add("//;\n1;2"));
    }
}
