package JAVAU2W2D3.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Edifici")
@Data
public class Edificio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	private String nome;
	private String indirizzo;
	private String città;

	@OneToMany(mappedBy = "edificio")
	private List<Postazione> postazioni;
}
