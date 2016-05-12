/**
 * 
 */
package org.suye.spring4.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author ye.su
 *
 */
@Configuration
@ComponentScan("org.suye.spring4.aop")
@EnableAspectJAutoProxy
public class AopConfig {
	
	

}
