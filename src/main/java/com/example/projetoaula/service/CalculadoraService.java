package com.example.projetoaula.service;
import org.springframework.stereotype.Service;

import com.example.projetoaula.domain.Calculadora;

@Service
public class CalculadoraService {
    
    public Calculadora create(Calculadora calculadora) {
        System.out.println("Teste de Criação: " + calculadora);
        return calculadora;
    }
}