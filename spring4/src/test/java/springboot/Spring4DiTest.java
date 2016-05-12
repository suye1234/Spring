package springboot;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.suye.spring4.config.DiConfig;
import org.suye.spring4.di.UseFunctionService;
import org.suye.spring4.javaconfig.JavaConfig;

public class Spring4DiTest {

	@Test
	public void testDi() {
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(DiConfig.class);
		
		UseFunctionService useFunctionService = annotationContext.getBean(UseFunctionService.class);
		
		String word = "World";
		
		assertEquals("Hello World", useFunctionService.sayHello(word));
		
		annotationContext.close();
	}
	
	@Test
	public void testDiByJavaConfig() {
		AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		org.suye.spring4.javaconfig.UseFunctionService useFunctionService = annotationContext.getBean(org.suye.spring4.javaconfig.UseFunctionService.class);
		
		String word = "World";
		
		assertEquals("Hello World", useFunctionService.sayHello(word));
		
		annotationContext.close();
	}
	

}
