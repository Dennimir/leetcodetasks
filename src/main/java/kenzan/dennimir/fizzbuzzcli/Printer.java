package kenzan.dennimir.fizzbuzzcli;

import java.util.Map;
import java.util.Arrays;
import java.util.List;

/**
 * @author Denis
 *
 */
public class Printer
{
	/**
	 * @param text
	 */
	public void printText(String text)
	{
		System.out.println(text);
	}
	
	/**
	 * @param Map <String, List<Integer>>
	 */
	public void printResult(Map <String, List<Integer>> result)
	{		
		System.out.println(Constants.FIZZ + ": " + getValues(Constants.FIZZ, result));
		System.out.println(Constants.BUZZ + ": " + getValues(Constants.BUZZ, result));
		System.out.println(Constants.FIZZBUZZ + ": " + getValues(Constants.FIZZBUZZ, result));
	}

	/**
	 * @param String
	 * @param Map <String, List<Integer>>
	 * @return String
	 */
	private String getValues(String key, Map <String, List<Integer>> result)
	{
		return (result.get(key) != null) ? result.get(key).toString() : "[ ]";		
	}
}
