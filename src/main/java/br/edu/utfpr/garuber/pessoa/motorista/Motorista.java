package br.edu.utfpr.garuber.pessoa.motorista;

import br.edu.utfpr.garuber.pessoa.Pessoa;
import br.edu.utfpr.garuber.veiculo.Veiculo;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Motorista extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String cnh;
    @OneToMany
    @NotNull
    private Set<Veiculo> veiculo;
    private Long avaliacao;

    public Motorista(Long id, String nome, String cpf, Long idade, String cnh, Long avaliacao) {
        super(id, nome, cpf, idade);
        this.id = id;
        this.cnh = cnh;
        this.avaliacao = avaliacao;
    }

    public Motorista(Long id, String nome, String cpf, Long idade) {
        super(id, nome, cpf, idade);
    }

    public Motorista() {

    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Long getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Long avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public Set<Veiculo> getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Set<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }
}
