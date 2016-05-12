/**
 * 
 */
package org.suye.spring.jms;

import javax.jms.Destination;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author ye.su
 * Email: suye@ehousechina.com
 * May 10, 2016
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/ac_springjms.xml")
public class SpringJmsTest {
	  	@Autowired
	    private ProducerService producerService;
	  	
	    @Autowired
	    @Qualifier("queueDestination")
	    private Destination destination;
	    
	    @Test
	    public void testSend() {
	        for (int i=0; i<2; i++) {
	            producerService.sendMessage(destination, "你好，生产者！这是消息：" + (i+1));
	        }
	    }
}
