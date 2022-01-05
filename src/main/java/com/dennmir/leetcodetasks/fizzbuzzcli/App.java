/*
 * Class name: App
 * Author: DenisM
 * Date: 29.10.2017
 * Description: FizBuzz main class
 */
package com.dennmir.leetcodetasks.fizzbuzzcli;

import java.util.List;
import java.util.Map;

/**
 * @author Denis
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
    	try
    	{
    		Printer mPrinter = new Printer();
    		FizzBuzzFinder mFizzBuzzFinder = new FizzBuzzFinder();
    		InputHandler mInputHandler = new InputHandler();        
    		int mUpperBoundary = 0;
    		Map <String, List<Integer>> mResult = null;        
      
    		mPrinter.printText(Constants.REQUEST_INPUT_PRINT);
       	
    		mUpperBoundary = mInputHandler.getInput(); 
    		mResult = mFizzBuzzFinder.findFizzBuzz(mUpperBoundary);
        
    		mPrinter.printText(Constants.RESULT_TITLE_PRINT);
    		mPrinter.printText(Constants.DIVIDING_LINE_PRINT);
        
    		mPrinter.printResult(mResult);
    	}
    	catch (Exception e)
    	{
    		System.err.println("Error: " + e);
    	}
    }
}
