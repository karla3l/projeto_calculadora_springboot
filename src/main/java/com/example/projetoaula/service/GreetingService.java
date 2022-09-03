package com.example.projetoaula.service;
import org.springframework.stereotype.Service;

import com.example.projetoaula.domain.Greeting;

@Service
public class GreetingService {
    
    public Greeting create(Greeting greeting) {
        System.out.println("Teste de Criação: " + greeting);
        return greeting;
    }
}