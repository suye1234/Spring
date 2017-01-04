/**
 * 
 */
package org.suye.spring4.springboot;

import static org.junit.Assert.assertEquals;

import javax.validation.constraints.AssertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.suye.spring4.config.DiConfig;
import org.suye.spring4.di.UseFunctionService;
import org.suye.spring4.scope.DemoPrototypeService;
import org.suye.spring4.scope.DemoSingletonService;
import org.suye.spring4.scope.ScopeConfig;


/**
 * @author ye.su 
 *
 */
public class Spring4ScopeTest {
	@Test
	public void testScope() {
AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
		
		DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
		DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
		
		
		DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
		
		
		Assert.assertTrue(s1.equals(s2));
		Assert.assertFalse(p1.equals(p2));
		
		context.close();
		
	}
}
