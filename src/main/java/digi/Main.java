package digi;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		MyObject obj=(MyObject)context.getBean("a");
		MyObject obj1=(MyObject)context.getBean("b");
		
		System.out.println(obj.getId()+ " " +obj.getName());
		System.out.println(obj1.getName()+" -> "+obj1.getParent().getName());

	}

}
