package guru.springframework.sfgdi.services;

public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Primary Bean - Hello";
    }
}
