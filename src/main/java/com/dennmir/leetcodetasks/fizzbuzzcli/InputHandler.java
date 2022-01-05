/*
 * Class name: InputHandler
 * Author: DenisM
 * Date: 29.10.2017
 * Description: Input handler
 */
package com.dennmir.leetcodetasks.fizzbuzzcli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputHandler
{
	/**
	 * @return Integer
	 */
	public int getInput()
	{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
        return validateAndReturnInput(br);
	}

	protected int validateAndReturnInput(BufferedReader br)
	{
		int upperBoundary = 0;
		while (true)
		{
			try
        	{
        		upperBoundary = Integer.parseInt(br.readLine());
        		if (upperBoundary<0 || upperBoundary>100)
        			System.err.println(Constants.INPUT_ERROR_MESSAGE);
        		else
        			break;
        	}
        	catch(NumberFormatException | IOException nfe)
        	{
        		System.err.println(Constants.INPUT_ERROR_MESSAGE);            
        	}
		}
		return upperBoundary;
	}
}
