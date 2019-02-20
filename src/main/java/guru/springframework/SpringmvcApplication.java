package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringmvcApplication {


    public static void main(String[] args) {

//        SpringApplication.run(Test.class, args);
        ApplicationContext ctx = SpringApplication.run(SpringmvcApplication.class, args);
        BeanInjectTest test1 = (BeanInjectTest) ctx.getBean("beanInjectTest");
        test1.getMessage();
    }
}
