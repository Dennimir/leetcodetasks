package kenzan.dennimir.fizzbuzzcli;

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
		int upperBoundary = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
