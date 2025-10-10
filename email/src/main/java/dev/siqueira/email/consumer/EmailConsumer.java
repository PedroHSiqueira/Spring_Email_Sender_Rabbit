package dev.siqueira.email.consumer;

import dev.siqueira.email.dto.EmailDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @RabbitListener(queues = "email-queue")
    public void listenEmailQueue(@Payload EmailDto email) {
        System.out.println(email.emailTo());
    }
}
