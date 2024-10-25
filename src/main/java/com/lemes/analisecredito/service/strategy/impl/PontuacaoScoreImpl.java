package com.lemes.analisecredito.service.strategy.impl;

import com.lemes.analisecredito.domain.Proposta;
import com.lemes.analisecredito.service.strategy.CalculoPonto;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class PontuacaoScoreImpl implements CalculoPonto {

    @Override
    public int calcular(Proposta proposta) {
        int score = score();
        
        if (score <= 200) {
            throw new RuntimeException("Score abaixo");
        } else if (score <= 400) {
            return 150;
        } else if (score <= 600) {
            return 180;
        } else {
            return 200;
        }
    }

    private int score() {
        return new Random().nextInt(0,1000);
    }
}
