package guru.springframework;

import org.springframework.stereotype.Component;

@Component
public class Test implements TestService{

    public void sayHello() {
        System.out.println("Hello World");
    }
}
