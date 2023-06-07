package JAVAU2W2D3.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import JAVAU2W2D3.entities.Prenotazione;

public interface PrenotazioniRepository extends JpaRepository<Prenotazione, Long> {

	Optional<Prenotazione> findById(UUID id);
}
