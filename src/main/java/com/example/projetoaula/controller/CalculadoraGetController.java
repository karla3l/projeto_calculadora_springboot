package com.example.projetoaula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.projetoaula.service.CalculadoraGetService;

import lombok.Data;


@RestController
@RequestMapping ("/")
@Data
public class CalculadoraGetController {

private Integer numero1 = 10;
private Integer numero2 = 2;
private Integer soma = numero1 + numero2;
private Integer subtracao = numero1 - numero2;
private Integer multiplicacao = numero1 * numero2;
private Integer divisao = numero1 / numero2;

@GetMapping("/soma")
public Integer Calculadoraget(){
 return getSoma();
}
@GetMapping("/subtracao")
public Integer CalculadoraSub(){
 return getSubtracao();
}
@GetMapping("/multiplicacao")
public Integer CalculadoMult(){
 return getMultiplicacao();
}
@GetMapping("/divisao")
public Integer CalculadoraDiv(){
 return getDivisao();
}
}
