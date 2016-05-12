/**
 * 
 */
package org.suye.spring4.javaconfig;

/**
 * @author ye.su 
 *
 */
public class UseFunctionService {
	private FunctionService functionService;
	
	
	public void setFunctionService(FunctionService functionService){
		this.functionService = functionService;
	}
	
	public String sayHello(String word){
		return functionService.sayHello(word);
	}
}
