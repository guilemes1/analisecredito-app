package com.lemes.analisecredito.listener;

import com.lemes.analisecredito.domain.Proposta;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class PropostaEmAnaliseListener {

    @RabbitListener(queues = "${proposta-pendente.ms-analise-credito}")
    public void propostaEmAnalise(Proposta proposta) {

    }
}
