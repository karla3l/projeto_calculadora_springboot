package com.example.projetoaula.service;

import org.springframework.stereotype.Service;
import com.example.projetoaula.domain.Calculadoraget;

@Service
public class CalculadoraGetService {
    public Calculadoraget create(Calculadoraget calculadora) {
        System.out.println("Teste de Criação: " + calculadora);
        return calculadora;
    }
    
}
