import static org.junit.Assert.assertEquals;

import com.codereligion.resource.HelloWorldResource;
import org.jboss.resteasy.client.ProxyFactory;
import org.junit.Test;

/**
 * Does a full integration test of the system. It expects an instance of this application running at
 * {@link IntegrationTest #BASE_PATH}.
 * 
 * @author sgroebler
 * @since 02.12.2012
 */
public class IntegrationTest {
	
	/**
	 * The servlet port of the application, set as system property by maven failsafe plugin.
	 */
	private static final String SERVLET_PORT = System.getProperty("integration.test.servlet.port");
	
	/**
	 * The context path of the application, set as system property by maven failsafe plugin.
	 */
	private static final String CONTEXT_PATH = System.getProperty("integration.test.context.path");

	/**
	 * Base path of this application.
	 */
	public static final String BASE_PATH = "http://localhost:" + SERVLET_PORT + "/" + CONTEXT_PATH;

	@Test
	public void test() {
		final HelloWorldResource service = ProxyFactory.create(HelloWorldResource.class, BASE_PATH);

		assertEquals("Hello world!", service.talk());
	}
}
