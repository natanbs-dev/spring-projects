package br.com.barbosa.aluno.service.repository;

import br.com.barbosa.aluno.service.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
