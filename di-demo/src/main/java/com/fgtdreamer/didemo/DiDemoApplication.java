package com.fgtdreamer.didemo;

import com.fgtdreamer.didemo.controllers.ConstructorInjectedController;
import com.fgtdreamer.didemo.controllers.MyController;
import com.fgtdreamer.didemo.controllers.PropertyInjectedController;
import com.fgtdreamer.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DiDemoApplication.class, args);
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");

        controller.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
