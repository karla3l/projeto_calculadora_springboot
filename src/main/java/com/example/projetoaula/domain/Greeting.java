package com.example.projetoaula.domain;

import lombok.Data;

@Data
public class Greeting {

    private String saudacao;

    public Greeting (){
        this.saudacao = "Hello World";
    }

}
