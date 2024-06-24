package br.com.barbosa.aluno.service.entity;

import br.com.barbosa.aluno.service.enumeration.Sexo;
import jakarta.persistence.*;

@Entity
public class Aluno {
    @Id
    @GeneratedValue

    private Long id;
    private String nomecompleto;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
