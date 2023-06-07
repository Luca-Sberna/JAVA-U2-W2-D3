package repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Prenotazione;

public interface PrenotazioniRepository extends JpaRepository<Prenotazione, Long> {

	Optional<Prenotazione> findById(UUID id);
}
