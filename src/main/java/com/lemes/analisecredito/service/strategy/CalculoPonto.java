package com.lemes.analisecredito.service.strategy;

import com.lemes.analisecredito.domain.Proposta;

public interface CalculoPonto {

    int calcular(Proposta proposta);
}
