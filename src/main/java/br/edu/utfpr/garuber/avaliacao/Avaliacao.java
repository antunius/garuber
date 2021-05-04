package br.edu.utfpr.garuber.avaliacao;

import br.edu.utfpr.garuber.corrida.Corrida;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Avaliacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long nota;

	@OneToOne
	private Corrida corrida;

	private String comentario;

}
