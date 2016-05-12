package springboot;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.suye.spring4.aop.AopConfig;
import org.suye.spring4.aop.DemoAnnotationService;
import org.suye.spring4.aop.DemoMethodService;

public class Spring4AopTest {

	@Test
	public void testAop() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

		DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

		DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

		demoAnnotationService.add();

		demoMethodService.add();
		
		Assert.assertTrue(true);

		context.close();
	
	}

}
