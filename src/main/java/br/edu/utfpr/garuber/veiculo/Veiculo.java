package br.edu.utfpr.garuber.veiculo;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ManyToOne
    private EspecificacaoVeiculo especificacaoVeiculo;

    @NotNull
    @NotEmpty
    @NotBlank
    private String placa;
    @NotNull
    private Long ano;
    @NotNull
    @NotEmpty
    @NotBlank
    private String cor;

    public Veiculo(Long id, @NotNull EspecificacaoVeiculo especificacaoVeiculo, @NotNull @NotEmpty @NotBlank String placa, @NotNull Long ano, @NotNull @NotEmpty @NotBlank String cor) {
        this.id = id;
        this.especificacaoVeiculo = especificacaoVeiculo;
        this.placa = placa;
        this.ano = ano;
        this.cor = cor;
    }

    public Veiculo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Long getAno() {
        return ano;
    }

    public void setAno(Long ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public EspecificacaoVeiculo getEspecificacaoVeiculo() {
        return especificacaoVeiculo;
    }

    public void setEspecificacaoVeiculo(EspecificacaoVeiculo especificacaoVeiculo) {
        this.especificacaoVeiculo = especificacaoVeiculo;
    }
}
