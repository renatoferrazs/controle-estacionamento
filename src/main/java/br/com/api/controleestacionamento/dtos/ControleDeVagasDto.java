package br.com.api.controleestacionamento.dtos;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class ControleDeVagasDto {
    @NotBlank
    private String numeroDaVaga;
    @NotBlank
    @Size(max = 7)
    private String placaDoCarro;
    @NotBlank
    private String marcaDoCarro;
    @NotBlank
    private String modeloDoCarro;
    @NotBlank
    private String corDoCarro;
    @NotBlank
    private String nomeDoResponsavel;
    @NotBlank
    private String apartamento;
    @NotBlank
    private String bloco;

}
