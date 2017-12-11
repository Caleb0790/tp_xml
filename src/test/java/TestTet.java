import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTet {

	@Test
	public void test() {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

}
