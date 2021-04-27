package br.edu.utfpr.garuber.corrida;

import br.edu.utfpr.garuber.avaliacao.Avaliacao;
import br.edu.utfpr.garuber.pagamento.Pagamento;
import br.edu.utfpr.garuber.pessoa.motorista.Motorista;
import br.edu.utfpr.garuber.pessoa.passageiro.Passageiro;
import br.edu.utfpr.garuber.veiculo.Veiculo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Corrida {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@OneToOne
	private TipoCorrida tipoCorrida;

	@Enumerated
	private CorridaStatus corridaStatus;

	@OneToOne
	private Motorista motorista;

	@OneToOne
	private Veiculo veiculo;

	@OneToOne
	@NotNull
	private Passageiro passageiro;

	@OneToOne
	private Avaliacao avaliacao;

	@OneToOne
	@NotNull
	private Pagamento pagamento;

	@NotNull
	private LocalDateTime inicioCorrida;

	private LocalDateTime fimCorrida;

	@NotNull
	private String latitudePartida;

	@NotNull
	private String longitudePartida;

	@NotNull
	private String latitudeDestino;

	@NotNull
	private String longitudeDestino;


}
