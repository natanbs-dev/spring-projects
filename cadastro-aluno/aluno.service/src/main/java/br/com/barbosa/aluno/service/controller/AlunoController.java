package br.com.barbosa.aluno.service.controller;

import br.com.barbosa.aluno.service.entity.Aluno;
import br.com.barbosa.aluno.service.service.AlunoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public record AlunoController(AlunoService alunoService) {
    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno) {
        return alunoService.salvar(aluno);
    }


}
