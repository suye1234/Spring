/**
 * 
 */
package org.suye.spring4.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



/**
 * @author ye.su
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
	String name();
}
