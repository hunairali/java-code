package io.spring.code.SpringApp;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Configuration
@ComponentScan("io.spring.code.SpringApp")
public class App {

    public static void main(String[] args) {
    	
    	
        ApplicationContext context =
                new AnnotationConfigApplicationContext(App.class);

        AppRunner appRunner = context.getBean(AppRunner.class);
        appRunner.run();
    }
}