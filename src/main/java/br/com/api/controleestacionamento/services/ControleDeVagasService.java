package br.com.api.controleestacionamento.services;

import br.com.api.controleestacionamento.models.ControleDeVagasModel;
import br.com.api.controleestacionamento.repositories.ControleDeVagasRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ControleDeVagasService {

    final ControleDeVagasRepository controleDeVagasRepository;

    public ControleDeVagasService(ControleDeVagasRepository controleDeVagasRepository) {
        this.controleDeVagasRepository = controleDeVagasRepository;
    }

    @Transactional
    public ControleDeVagasModel save(ControleDeVagasModel controleDeVagaModel) {
        return controleDeVagasRepository.save(controleDeVagaModel);
    }
}
