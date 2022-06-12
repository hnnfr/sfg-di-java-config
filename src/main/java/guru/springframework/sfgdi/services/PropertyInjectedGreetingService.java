package guru.springframework.sfgdi.services;

public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Property Injected - Hello";
    }
}
