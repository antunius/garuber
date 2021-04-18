package br.edu.utfpr.garuber.pessoa.passageiro;

import br.edu.utfpr.garuber.pessoa.Pessoa;
import br.edu.utfpr.garuber.pessoa.motorista.Motorista;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Passageiro extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private Set<Motorista> motoristasFavoritos;

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

    public Passageiro(Long id, String nome, String cpf, Long idade, Set<Motorista> motoristasFavoritos) {
        super(id, nome, cpf, idade);
        this.motoristasFavoritos = motoristasFavoritos;
    }

    public Passageiro(Long id, Set<Motorista> motoristasFavoritos) {
        this.id = id;
        this.motoristasFavoritos = motoristasFavoritos;
    }

    public Set<Motorista> getMotoristasFavoritos() {
        return motoristasFavoritos;
    }

    public void setMotoristasFavoritos(Set<Motorista> motoristasFavoritos) {
        this.motoristasFavoritos = motoristasFavoritos;
    }
}
