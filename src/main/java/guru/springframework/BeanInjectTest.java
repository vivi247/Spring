package guru.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanInjectTest {

    @Autowired
    private TestService test;

    public void getMessage() {
        test.sayHello();
    }
}
