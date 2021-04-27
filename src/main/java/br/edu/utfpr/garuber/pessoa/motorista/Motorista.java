package br.edu.utfpr.garuber.pessoa.motorista;

import br.edu.utfpr.garuber.pessoa.Pessoa;
import br.edu.utfpr.garuber.veiculo.Veiculo;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
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

}
