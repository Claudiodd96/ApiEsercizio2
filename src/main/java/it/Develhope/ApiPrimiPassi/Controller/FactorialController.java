package it.Develhope.ApiPrimiPassi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FactorialController {


    @GetMapping(value = "getFactorial/{n}")
    public int getFactorial(@PathVariable int n){
        int i;
        int factorial=1;

        for(i=1; i<=n; i++) {
            factorial=factorial*i;
        }
        return factorial;
    }
}
