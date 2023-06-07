package JAVAU2W2D3.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import JAVAU2W2D3.entities.Edificio;

public interface EdificiRepository extends JpaRepository<Edificio, Long> {
	Optional<Edificio> findByNameIgnoreCase(String name);

	List<Edificio> findByNameAndSurname(String name, String surname);

	Optional<Edificio> findById(UUID id);
}