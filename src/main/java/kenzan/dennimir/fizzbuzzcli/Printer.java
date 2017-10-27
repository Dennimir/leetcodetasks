package kenzan.dennimir.fizzbuzzcli;

import java.util.Map;
import java.util.Arrays;

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
	 * @param result
	 */
	public void printResult(Map <String, int[]> result)
	{	
		System.out.println(Constants.FIZZ + ": " +Arrays.toString(result.get(Constants.FIZZ)));
		System.out.println(Constants.BUZZ + ": " +Arrays.toString(result.get(Constants.BUZZ)));
		System.out.println(Constants.FIZZBUZZ + ": " +Arrays.toString(result.get(Constants.FIZZBUZZ)));
	}
}
