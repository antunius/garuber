package br.edu.utfpr.garuber.veiculo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotEmpty
    @NotBlank
    private String modelo;
    @NotNull
    @NotEmpty
    @NotBlank
    private String marca;
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

    public Veiculo(Long id, String modelo, String marca, String placa, Long ano, String cor) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
}
