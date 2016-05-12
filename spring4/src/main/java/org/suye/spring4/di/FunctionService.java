/**
 * 
 */
package org.suye.spring4.di;

import org.springframework.stereotype.Service;

/**
 * @author ye.su 
 *
 */
@Service
public class FunctionService {
	public String sayHello(String word){
		return "Hello " + word;
	}
}
