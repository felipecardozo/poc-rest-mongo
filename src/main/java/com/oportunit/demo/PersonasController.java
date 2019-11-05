package com.oportunit.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonasController {

    @GetMapping("/hola")
    public String metodo(){
        return "Hola Mundo !!";
    }

}
