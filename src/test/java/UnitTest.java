import static org.junit.Assert.assertEquals;

import com.codereligion.service.HelloWorldServiceImpl;

import com.codereligion.service.HelloWorldService;

import org.junit.Test;


/**
 * Does a small unit test of the {@link HelloWorldService}.
 *
 * @author sgroebler
 * @since 02.12.2012
 */
public class UnitTest {

	@Test
	public void test() {
		final HelloWorldService helloService = new HelloWorldServiceImpl();
		
		assertEquals("Hello world!", helloService.sayHelloWorld());
	}
}
