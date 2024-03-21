package com.sgcv.ads.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity
@Table(name = "tb_registra_gasto")
public class RegistraGastos {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String data;
    private float valorGasto;
    private String descricao;

    @ManyToOne()
    @JoinColumn(name = "id_gastos")
    private Veiculo gastos;


    public RegistraGastos(Long id, String data, float valorGasto ,String descricao) {
        this.id = id;
        this.data = data;
        this.valorGasto = valorGasto;
        this.descricao = descricao;
    }
    
}
