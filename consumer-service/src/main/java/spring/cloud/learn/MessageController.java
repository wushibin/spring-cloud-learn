package spring.cloud.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.cloud.learn.client.HelloWorldClient;

/**
 * 17-5-17.
 */
@Controller
public class MessageController {
    @Autowired
    private HelloWorldClient helloWorldClient;

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    @ResponseBody
    public String echoHelloworld(){
        return helloWorldClient.helloWorld();
    }
}
