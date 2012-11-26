import static org.junit.Assert.assertEquals;

import com.codereligion.rest.HelloRestResource;

import org.jboss.resteasy.client.ProxyFactory;
import org.junit.Test;


public class IntegrationTest {

	@Test
	public void test() {
		final HelloRestResource service = ProxyFactory.create(HelloRestResource.class, "http://localhost:8080/api");
		
		assertEquals("world	", service.world());
	}
}
