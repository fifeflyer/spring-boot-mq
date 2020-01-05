package example.spring.mq;

import example.spring.mq.message.MessageSender;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class Application implements CommandLineRunner {

    private final MessageSender messageSender;

    @Override
    public void run(String... args) {
        messageSender.sendTestMessages();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
