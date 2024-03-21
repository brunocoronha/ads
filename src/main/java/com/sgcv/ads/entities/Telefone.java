package com.sgcv.ads.entities;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString

public class Telefone {

    private String ddi;
    private String ddd;
    private String numeroTelefone;

    @ManyToOne
    @JoinColumn(name = "id_proprietario")
    private Proprietario proprietario;

    public Telefone(String ddi, String ddd, String numeroTelefone) {
        this.ddi = ddi;
        this.ddd = ddd;
        this.numeroTelefone = numeroTelefone;

    }    

}
