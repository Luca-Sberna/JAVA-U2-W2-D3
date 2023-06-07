package JAVAU2W2D3.entities;

import java.util.List;
import java.util.UUID;

import JAVAU2W2D3.utils.TipoPostazione;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Postazioni")
@Data
public class Postazione {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	private String codice;
	private String descrizione;
	private TipoPostazione tipo;
	private int maxOccupanti;

	@ManyToOne
	private Edificio edificio;

	@OneToMany(mappedBy = "postazione")
	private List<Prenotazione> prenotazioni;
}
