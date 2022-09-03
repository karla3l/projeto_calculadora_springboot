package com.example.projetoaula.domain;

import lombok.Data;

@Data
public class Calculadora {

    private String calcular;

    public Calculadora (){
        this.calcular = "Projeto Calculadora em SpringBoot";
    }

}
