package guru.springframework.sfgdi.services;

public class SetterInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Setter Injected - Hello";
    }
}
