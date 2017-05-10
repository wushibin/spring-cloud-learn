package spring.cloud.learn;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class HelloWorldControllerTest {
    @org.junit.Test
    public void response_should_contain_hello_world() throws Exception {
        HelloWorldController helloWorldController = new HelloWorldController();
        standaloneSetup(helloWorldController).build()
                .perform(get("/helloworld"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello world!"));
    }
}
