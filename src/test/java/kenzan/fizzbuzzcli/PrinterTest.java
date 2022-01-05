package kenzan.fizzbuzzcli;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;

public class PrinterTest extends TestCase
{
	@Test
	public void testPrintTextNoError()
	{
		Exception exception = null;
		try
		{
			Printer mPrinter = new Printer();
			mPrinter.printText("Hello");
		}
		catch (Exception e)
		{
			exception = e;
		}		
		Assert.assertNull(exception);		
	}
	
	@Test
	public void testPrintResultNoErrorFullMap()
	{
		Map <String, List<Integer>> result = new HashMap<>();
		Exception exception = null;
		List<Integer> resultList = new ArrayList<>();		
		resultList.add(1);
		resultList.add(2);
		resultList.add(3);		
		result.put(Constants.FIZZ, resultList);
		result.put(Constants.BUZZ, resultList);
		result.put(Constants.FIZZBUZZ, resultList);	
		
		try
		{
			Printer mPrinter = new Printer();
			mPrinter.printResult(result);
		}
		catch (Exception e)
		{
			exception = e;
		}		
		Assert.assertNull(exception);
	}
	
	
	@Test
	public void testPrintResultNoErrorPartMap()
	{
		Map <String, List<Integer>> result = new HashMap<>();
		Exception exception = null;
		List<Integer> resultList = new ArrayList<>();		
		resultList.add(1);
		resultList.add(2);
		resultList.add(3);		
		result.put(Constants.FIZZ, resultList);
		result.put(Constants.BUZZ, resultList);			
		
		try
		{
			Printer mPrinter = new Printer();
			mPrinter.printResult(result);
		}
		catch (Exception e)
		{
			exception = e;
		}		
		Assert.assertNull(exception);
	}	
}
