package br.com.api.controleestacionamento.models;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_VAGA_ESTACIONAMENTO")
public class ControleDeVagasModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String numeroDaVaga;
    @Column(nullable = false, unique = true, length = 7)
    private String placaDoCarro;
    @Column(nullable = false,length = 70)
    private String marcaDoCarro;
    @Column(nullable = false,length = 70)
    private String modeloDoCarro;
    @Column(nullable = false,length = 70)
    private String corDoCarro;
    @Column(nullable = false)
    private LocalDateTime dataDoRegistro;
    @Column(nullable = false,length = 130)
    private String nomeDoResponsavel;
    @Column(nullable = false,length = 30)
    private String apartamento;
    @Column(nullable = false,length = 30)
    private String bloco;


}
