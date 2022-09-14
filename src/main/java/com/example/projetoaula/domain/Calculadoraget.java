package com.example.projetoaula.domain;

import lombok.Data;

@Data
public class Calculadoraget {

    private Double numero1;
    private Double numero2;
    

    public Calculadoraget() {
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }
}