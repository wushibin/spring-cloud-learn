package spring.cloud.learn.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Using Feign to invoke Helloworld service.
 */

@FeignClient("provider-service")
public interface HelloWorldClient {
    @RequestMapping(method = RequestMethod.GET, value = "/helloworld")
    String helloWorld();
}
