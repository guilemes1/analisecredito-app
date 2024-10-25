package com.lemes.analisecredito.service.strategy.impl;

import com.lemes.analisecredito.domain.Proposta;
import com.lemes.analisecredito.service.strategy.CalculoPonto;

import java.util.Random;

public class NomeNegativadoImpl implements CalculoPonto {
    @Override
    public int calcular(Proposta proposta) {
        if (nomeNegativado()) {
            throw new RuntimeException("Nome negativado");
        }
        return 100;
    }

    private boolean nomeNegativado() {
        return new Random().nextBoolean();
    }
}