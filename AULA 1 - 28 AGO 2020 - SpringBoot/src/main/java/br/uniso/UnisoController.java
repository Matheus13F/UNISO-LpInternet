package br.uniso;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//classe de controle
//ela pega a requisição http do brwouswe
//e processa para devolver uma resposta

@RestController("/uniso/")
public class UnisoController {

    @RequestMapping("hello")
    public String helloWorld() {
        return "Essa foi a primeira aula, expusemos uma API GET em Java com Sping Boot." + "Coloque tudo no linkedin";
    }

}


