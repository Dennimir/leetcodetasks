/*
 * Class name: FizzBuzzFinder
 * Author: DenisM
 * Date: 29.10.2017
 * Description: FizzBuzz logic implemetation class
 */
package kenzan.fizzbuzzcli;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FizzBuzzFinder
{
	/**
	 * @param upperBoundary
	 * @return Map <String, List<Integer>>
	 */
	public Map <String, List<Integer>> findFizzBuzz(int upperBoundary)
	{
		Map <String,List<Integer>> result = new HashMap<>();		

		List<Integer> intListFizzBuzz = new ArrayList<>();		
		List<Integer> intListFizz = new ArrayList<>();
		List<Integer> intListBuzz = new ArrayList<>();
		
		getListsFizzBuzz(upperBoundary, intListFizzBuzz, intListFizz, intListBuzz);		
		
		result.put(Constants.FIZZ, intListFizz);
		result.put(Constants.BUZZ, intListBuzz);
		result.put(Constants.FIZZBUZZ, intListFizzBuzz);
		
		return result;		
	}

	/**
	 * @param upperBoundary
	 * @param intListFizzBuzz
	 * @param intListFizz
	 * @param intListBuzz
	 */
	private void getListsFizzBuzz(int upperBoundary, List<Integer> intListFizzBuzz, List<Integer> intListFizz, List<Integer> intListBuzz)
	{
		for (int i = 1; i <= upperBoundary; i++)
		{
			if (i % Constants.MULTIPLIER_FIFTEEN == 0)
			{
				intListFizzBuzz.add(i);
            }
			else if (i % Constants.MULTIPLIER_THREE == 0)
			{
				intListFizz.add(i);
            }
			else if (i % Constants.MULTIPLIER_FIVE == 0)
			{
				intListBuzz.add(i);
            }
		}
	}

}
