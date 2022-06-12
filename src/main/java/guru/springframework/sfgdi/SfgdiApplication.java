package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgdiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SfgdiApplication.class, args);

        ConstructorInjectedController constructorInjectedController = context.getBean("constructorInjectedController", ConstructorInjectedController.class);
        System.out.println(constructorInjectedController.getGreeting());

        SetterInjectedController setterInjectedController = context.getBean("setterInjectedController", SetterInjectedController.class);
        System.out.println(setterInjectedController.getGreeting());

        PropertyInjectedController propertyInjectedController = context.getBean("propertyInjectedController", PropertyInjectedController.class);
        System.out.println(propertyInjectedController.getGreeting());

        I18nController i18NController = context.getBean("i18nController", I18nController.class);
        System.out.println(i18NController.getGreeting());

        MyController myController = context.getBean("myController", MyController.class);
        System.out.println(myController.getGreeting());
    }

}
