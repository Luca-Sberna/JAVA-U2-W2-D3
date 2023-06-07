package JAVAU2W2D3.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import JAVAU2W2D3.entities.Edificio;

public interface EdificiRepository extends JpaRepository<Edificio, Long> {
	Optional<Edificio> findByNomeIgnoreCase(String name);

	Optional<Edificio> findById(UUID id);
}
