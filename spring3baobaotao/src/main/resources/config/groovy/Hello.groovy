package config.groovy

import org.springframework.stereotype.Service
import org.suye.spring3.service.HelloService

@Service
class Hello implements HelloService{
    @Override
    String doHello() {
        return "Hello Groovy !"
    }
}