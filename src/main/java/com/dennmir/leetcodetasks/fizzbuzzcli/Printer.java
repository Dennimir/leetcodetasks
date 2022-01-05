/*
 * Class name: Printer
 * Author: DenisM
 * Date: 29.10.2017
 * Description: Printer
 */
package com.dennmir.leetcodetasks.fizzbuzzcli;

import java.util.Map;
import java.util.List;

/**
 * @author Denis
 *
 */
public class Printer
{

	public void printText(String text)
	{
		System.out.println(text);
	}
	

	public void printResult(Map <String, List<Integer>> result)
	{		
		System.out.println(Constants.FIZZ + ": " + getValues(Constants.FIZZ, result));
		System.out.println(Constants.BUZZ + ": " + getValues(Constants.BUZZ, result));
		System.out.println(Constants.FIZZBUZZ + ": " + getValues(Constants.FIZZBUZZ, result));
	}


	private String getValues(String key, Map <String, List<Integer>> result)
	{
		return (result.get(key) != null) ? result.get(key).toString() : "[ ]";		
	}
}
