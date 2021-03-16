package br.edu.utfpr.garuber.pessoa.passageiro;

import br.edu.utfpr.garuber.pessoa.Pessoa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passageiro extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Passageiro() {

    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Passageiro(Long id, String nome, String cpf, Long idade) {
        super(id, nome, cpf, idade);
    }

    public Passageiro(Long id) {
        this.id = id;
    }
}
