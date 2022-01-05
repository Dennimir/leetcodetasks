package kenzan.fizzbuzzcli;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

import com.dennmir.leetcodetasks.fizzbuzzcli.InputHandler;
import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

public class InputHandlerTest  extends TestCase
{
	@Test
	public void testGetInputInputOne()
	{
		InputHandler inputHandler = new InputHandler();
		int resut;
		int expectedResult = 1;
		System.setIn(new ByteArrayInputStream("1".getBytes()));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//resut = inputHandler.validateAndReturnInput(br);
		//Assert.assertEquals(expectedResult, resut);
	}
}
