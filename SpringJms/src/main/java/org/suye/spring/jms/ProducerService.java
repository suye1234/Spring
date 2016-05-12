/**
 * 
 */
package org.suye.spring.jms;

import javax.jms.Destination;

import org.springframework.stereotype.Service;

/**
 * @author ye.su
 * Email: suye@ehousechina.com
 * May 10, 2016
 *
 */
public interface ProducerService {
	
	void sendMessage(Destination destination, final String message);

}
