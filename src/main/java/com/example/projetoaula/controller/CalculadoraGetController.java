package com.example.projetoaula.controller;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.example.projetoaula.service.CalculadoraGetService;

import lombok.Data;


@RestController
@RequestMapping ("/")
@Data
public class CalculadoraGetController {

private Integer num1=1;
private Integer num2=2;
private Integer soma = num1 + num2;
private Integer subtracao = num1 - num2;
private Integer multiplicacao = num1 * num2;
private Integer divisao = num1 / num2;

@GetMapping("calculator/{num1}/{num2}")
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
