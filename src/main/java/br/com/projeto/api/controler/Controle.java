package br.com.projeto.api.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.entidade.Pessoa;

@RestController
public class Controle {
 
    @GetMapping ("")
    public String mensagem(){
     return "Hello World";

    }

    @GetMapping("/bemVindo")
    public String boasVindas(){
    return "Seja bem vindo "; 

    }


    @GetMapping("/bemVindo/{nome}")
    public String boasVindas(@PathVariable String nome){
    return "Seja bem vindo "+ nome+"! "; 
    
    } 
    @PostMapping("/pessoa")
    public Pessoa pessoa(@RequestBody Pessoa p){
        return p;

    }
}
 

