package br.edu.utfpr.garuber.pagamento;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
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

    public Pagamento() {
    }

    public Pagamento(Long id, BigDecimal valor, FormaPagamento formaPagamento, LocalDateTime dataPagamento) {
        this.id = id;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.dataPagamento = dataPagamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
}
