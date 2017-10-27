package kenzan.dennimir.fizzbuzzcli;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzzFinder
{
	/**
	 * @param upperBoundary
	 * @return Map <String, int[]>
	 */
	public Map <String, int[]> findFizzBuzz(int upperBoundary)
	{
		Map <String, int[]> result = new HashMap<>();
		
		int[] intLine = {1,2,3,4};
		
		result.put(Constants.FIZZ, intLine);
		result.put(Constants.BUZZ, intLine);
		result.put(Constants.FIZZBUZZ, intLine);
		
		return result;		
	}

}
