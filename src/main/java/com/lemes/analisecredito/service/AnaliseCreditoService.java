package com.lemes.analisecredito.service;

import com.lemes.analisecredito.domain.Proposta;
import com.lemes.analisecredito.service.strategy.CalculoPonto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnaliseCreditoService {

    @Autowired
    private List<CalculoPonto> calculoPontoList;

    public void analisar(Proposta proposta) {
        int score = calculoPontoList.stream().mapToInt(impl -> impl.calcular(proposta)).sum();

    }
}
