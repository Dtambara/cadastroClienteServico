package com.cadastrocliente.components;

import com.rabbitmq.client.impl.AMQImpl;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.rest.webmvc.support.BackendId;
import org.springframework.stereotype.Component;
import org.springframework.amqp.core.Queue;
@Component
@Lazy
public class Sender {

    @Autowired
    RabbitMessagingTemplate template;

    @Bean
    Queue queue() {
        return new Queue("ClienteQ", false);
    }

    public void enviaEmail(String mensagem) {
        template.convertAndSend("ClienteQ", mensagem);
    }
}
