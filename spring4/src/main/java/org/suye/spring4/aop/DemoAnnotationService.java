/**
 * 
 */
package org.suye.spring4.aop;

import org.springframework.stereotype.Service;

/**
 * @author ye.su
 *
 */
@Service
public class DemoAnnotationService {

	@Action(name="annotation interceptor")
	public void add(){
		
		System.out.println("Insert data into db");
	}
}
