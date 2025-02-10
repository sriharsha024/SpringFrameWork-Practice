package car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load the Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        MyBean myBean = (MyBean) context.getBean("myBean");
        System.out.println(myBean);
    }
}
