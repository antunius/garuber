package br.edu.utfpr.garuber.pessoa.passageiro;

import br.edu.utfpr.garuber.avaliacao.Avaliacao;
import br.edu.utfpr.garuber.pessoa.Pessoa;
import br.edu.utfpr.garuber.pessoa.motorista.Motorista;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Passageiro extends Pessoa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToMany
	private Set<Motorista> motoristasFavoritos;

	private BigInteger avaliacao;

}

