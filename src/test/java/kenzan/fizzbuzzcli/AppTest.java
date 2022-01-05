package kenzan.fizzbuzzcli;

import java.io.ByteArrayInputStream;

import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
	@Test
	public void testAppNoError()
	{
		Exception exception = null;
		try
		{
			System.setIn(new ByteArrayInputStream("15".getBytes()));
			App.main(null);
		}
		catch (Exception e)
		{
			exception = e;
		}
		Assert.assertNull(exception);
	}
}
