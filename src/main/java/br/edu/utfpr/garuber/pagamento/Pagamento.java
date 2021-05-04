package br.edu.utfpr.garuber.pagamento;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(precision=10, scale=2)
    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    @NotNull
    private FormaPagamento formaPagamento;

    private LocalDateTime dataPagamento;


}
