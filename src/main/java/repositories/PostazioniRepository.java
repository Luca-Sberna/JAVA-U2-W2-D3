package repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Postazione;

public interface PostazioniRepository extends JpaRepository<Postazione, String> {
	Optional<Postazione> findByNameIgnoreCase(String name);

	List<Postazione> findByNameAndSurname(String name, String surname);

	Optional<Postazione> findById(UUID id);
}
