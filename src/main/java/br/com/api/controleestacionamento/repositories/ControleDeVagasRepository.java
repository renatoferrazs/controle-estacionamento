package br.com.api.controleestacionamento.repositories;

import br.com.api.controleestacionamento.models.ControleDeVagasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ControleDeVagasRepository extends JpaRepository<ControleDeVagasModel, UUID> {
}
