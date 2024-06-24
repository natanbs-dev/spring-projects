package br.com.barbosa.aluno.service.service;

import br.com.barbosa.aluno.service.entity.Aluno;
import br.com.barbosa.aluno.service.repository.AlunoRepository;
import org.springframework.stereotype.Service;

@Service
public record AlunoService(AlunoRepository alunoRepository) {
    public Aluno salvar(Aluno aluno) {
        return alunoRepository.save(aluno);
    }



}
