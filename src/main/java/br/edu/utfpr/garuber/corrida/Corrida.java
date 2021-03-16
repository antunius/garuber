package br.edu.utfpr.garuber.corrida;

import br.edu.utfpr.garuber.avaliacao.Avaliacao;
import br.edu.utfpr.garuber.pagamento.Pagamento;
import br.edu.utfpr.garuber.pessoa.motorista.Motorista;
import br.edu.utfpr.garuber.pessoa.passageiro.Passageiro;
import br.edu.utfpr.garuber.veiculo.Veiculo;

import javax.persistence.*;

@Entity
public class Corrida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private TipoCorrida tipoCorrida;

    @OneToOne
    private Motorista motorista;
    @OneToOne
    private Veiculo veiculo;
    @OneToOne
    private Passageiro passageiro;
    @OneToOne
    private Avaliacao avaliacao;
    @OneToOne
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
}
