package br.edu.utfpr.garuber.avaliacao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long nota;
    private String comentario;

    public Avaliacao(Long id, Long nota, String comentario) {
        this.id = id;
        this.nota = nota;
        this.comentario = comentario;
    }

    public Avaliacao() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNota() {
        return nota;
    }

    public void setNota(Long nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
