package com.operaize.operaize.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    
    // http://localhost:8888/hello/002
    @GetMapping("hello/{id}")
    public String Hello(@PathVariable("id") String Id){
        return("Hello Wie gehts Mr"+ (Id));
    }
     

    // http://localhost:8888/hello?id=002
    @GetMapping("hello")
    public String Bitte(@RequestParam("id") String Id){
        return("Bitte Mach das nicht mit RequestParam"+Id);
    }
}
