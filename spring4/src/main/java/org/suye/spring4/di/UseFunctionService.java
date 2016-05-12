/**
 * 
 */
package org.suye.spring4.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ye.su 
 *
 */
@Service
public class UseFunctionService {
	@Autowired
	FunctionService functionService;
	
	public String sayHello(String word){
		
		return functionService.sayHello(word);
	}
	
	

}
