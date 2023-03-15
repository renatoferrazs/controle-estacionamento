package br.com.api.controleestacionamento.controllers;

import br.com.api.controleestacionamento.dtos.ControleDeVagasDto;
import br.com.api.controleestacionamento.models.ControleDeVagasModel;
import br.com.api.controleestacionamento.services.ControleDeVagasService;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;


@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/controle-de-vagas")
public class ControleDeVagasController {

    final ControleDeVagasService controleDeVagasService;

    public ControleDeVagasController(ControleDeVagasService controleDeVagasService){
        this.controleDeVagasService = controleDeVagasService;
    }

    @PostMapping
    public ResponseEntity<Object> salvaVaga(@RequestBody @Valid ControleDeVagasDto controleDeVagasDto){
        var controleDeVagaModel = new ControleDeVagasModel();
        BeanUtils.copyProperties(controleDeVagasDto, controleDeVagaModel);
        controleDeVagaModel.setDataDoRegistro(LocalDateTime.now(ZoneId.of("UTC")));
        return  ResponseEntity.status(HttpStatus.CREATED).body(controleDeVagasService.save(controleDeVagaModel));
    }
}
