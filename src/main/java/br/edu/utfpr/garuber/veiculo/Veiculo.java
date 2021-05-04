package br.edu.utfpr.garuber.veiculo;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data
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

}
