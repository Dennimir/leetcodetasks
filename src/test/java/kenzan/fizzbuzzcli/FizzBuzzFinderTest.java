package kenzan.fizzbuzzcli;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class FizzBuzzFinderTest  extends TestCase
{
	Map <String,List<Integer>> expectedResult = new HashMap<>();		
	List<Integer> intListFizzBuzz = new ArrayList<>();		
	List<Integer> intListFizz = new ArrayList<>();
	List<Integer> intListBuzz = new ArrayList<>();
	

	private void prepareData_inputThree()
	{
		intListFizz.add(3);		
		expectedResult.put(Constants.FIZZ, intListFizz);
		expectedResult.put(Constants.BUZZ, intListBuzz);
		expectedResult.put(Constants.FIZZBUZZ, intListFizzBuzz);		
	}
	
	private void prepareData_inputFromTask()
	{		
		intListFizz.add(3);
		intListFizz.add(6);
		intListFizz.add(9);
		intListFizz.add(12);
		
		intListBuzz.add(5);
		intListBuzz.add(10);
		
		intListFizzBuzz.add(15);
		
		expectedResult.put(Constants.FIZZ, intListFizz);
		expectedResult.put(Constants.BUZZ, intListBuzz);
		expectedResult.put(Constants.FIZZBUZZ, intListFizzBuzz);		
	}
	
	@Test
	public void testFindFizzBuzzNoError_inputThree()
	{
		prepareData_inputThree();
		Map <String,List<Integer>> actualResult = new HashMap<>();
		int upperBoundary = 3;
		FizzBuzzFinder fizzBuzzFinder = new FizzBuzzFinder();
		actualResult = fizzBuzzFinder.findFizzBuzz(upperBoundary);
		Assert.assertEquals(expectedResult, actualResult);
	}	
	
	@Test
	public void testFindFizzBuzzNoError_inputFromTask()
	{
		prepareData_inputFromTask();
		Map <String,List<Integer>> actualResult = new HashMap<>();
		int upperBoundary = 15;
		FizzBuzzFinder fizzBuzzFinder = new FizzBuzzFinder();
		actualResult = fizzBuzzFinder.findFizzBuzz(upperBoundary);
		Assert.assertEquals(expectedResult, actualResult);
	}	
}
