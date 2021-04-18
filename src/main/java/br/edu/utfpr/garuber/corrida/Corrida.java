package br.edu.utfpr.garuber.corrida;

import br.edu.utfpr.garuber.avaliacao.Avaliacao;
import br.edu.utfpr.garuber.pagamento.Pagamento;
import br.edu.utfpr.garuber.pessoa.motorista.Motorista;
import br.edu.utfpr.garuber.pessoa.passageiro.Passageiro;
import br.edu.utfpr.garuber.veiculo.Veiculo;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Corrida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @NotNull
    private TipoCorrida tipoCorrida;

    @OneToOne
    @NotNull
    private Motorista motorista;

    @OneToOne
    @NotNull
    private Veiculo veiculo;

    @OneToOne
    @NotNull
    private Passageiro passageiro;

    @OneToOne
    @NotNull
    private Avaliacao avaliacao;

    @OneToOne
    @NotNull
    private Pagamento pagamento;

    public Corrida(Long id, TipoCorrida tipoCorrida, Motorista motorista, Veiculo veiculo, Passageiro passageiro, Avaliacao avaliacao) {
        this.id = id;
        this.tipoCorrida = tipoCorrida;
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.passageiro = passageiro;
        this.avaliacao = avaliacao;
    }

    public Corrida() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoCorrida getTipoCorrida() {
        return tipoCorrida;
    }

    public void setTipoCorrida(TipoCorrida tipoCorrida) {
        this.tipoCorrida = tipoCorrida;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
