package guru.springframework;

import org.springframework.stereotype.Component;

@Component
public class Test1 implements TestService {

    @Override
    public void sayHello() {
        System.out.println("Hello Test1");
    }

    public void sayTest1() {
        System.out.println("Test1");
    }
}
