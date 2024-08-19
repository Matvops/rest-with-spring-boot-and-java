package br.com.erudio.rest_with_spring_boot_and_java.resources;

import br.com.erudio.rest_with_spring_boot_and_java.exceptions.UnsupportedMathOperationException;
import br.com.erudio.rest_with_spring_boot_and_java.services.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "/math")
public class MathController {
    private static final AtomicLong counter  = new AtomicLong();

    @Autowired
    private MathService service;

    @GetMapping(value = "sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable(value = "numberOne") String num1, @PathVariable(value = "numberTwo") String num2) {
        return service.sum(num1, num2);
    }

    @GetMapping(value = "sub/{numberOne}/{numberTwo}")
    public Double sub(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo){
        return service.sub(numberOne, numberTwo);
    }

    @GetMapping(value = "mul/{numberOne}/{numberTwo}")
    public Double mul(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo){
        return service.mul(numberOne, numberTwo);
    }

    @GetMapping(value = "div/{numberOne}/{numberTwo}")
    public Double div(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo){
        return service.div(numberOne, numberTwo);
    }

    @GetMapping(value = "sqr/{numberOne}")
    public Double sqrRoot(@PathVariable(value = "numberOne") String numberOne){
        return service.sqr(numberOne);
    }
}
