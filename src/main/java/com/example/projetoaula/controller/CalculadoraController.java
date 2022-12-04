package com.example.projetoaula.controller;

//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.stereotype.Service;

import org.springframework.http.HttpStatus;
import com.example.projetoaula.dto.CalculadoraRequest;
import com.example.projetoaula.dto.CalculadoraResponse;

@RestController
@RequestMapping(value ="/greeting")
public class CalculadoraController {
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CalculadoraResponse calcularPost(@RequestBody CalculadoraRequest rq) {

        CalculadoraResponse rs = new CalculadoraResponse();
        //rs.setResultado(0.0);
        rs.setResultado(rq.getNum1() + rq.getNum2());

       /*  try {
            switch (rq.getOperacao()) {
                case "+":
                    rs.setResultado(rq.getNum1() + rq.getNum2());
                    break;
                case "-":
                    rs.setResultado(rq.getNum1() - rq.getNum2());
                    break;
                case "*":
                    rs.setResultado(rq.getNum1() * rq.getNum2());
                    break;
                case "/":
                    rs.setResultado(rq.getNum1() / rq.getNum2());
                    break;
                default:
                    break;

            }
        } catch (Exception e) {
        } */

        return rs;
        //return service.create(rs);
    }

}