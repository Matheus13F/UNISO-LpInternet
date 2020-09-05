package br.uniso;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

//classe de controle
//ela pega a requisição http do brwouswe
//e processa para devolver uma resposta



@RestController("/uniso/")
public class UnisoController {

    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    @PostMapping("criarAluno")
    public boolean criarAluno(@RequestBody  Aluno aluno) {

        alunos.add(aluno);
        return true;
    }

    @GetMapping("hello")
    public String helloWorld(@RequestParam String nome, @RequestParam String idade) {

        return "Ola pessoa chamada " + nome + " e idade de apenas " + idade;
    }

    @GetMapping("/alunos")
    public ArrayList<Aluno> getAlunos() {

        return alunos;
    }

}


