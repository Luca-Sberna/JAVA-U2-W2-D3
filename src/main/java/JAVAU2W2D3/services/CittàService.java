package JAVAU2W2D3.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import JAVAU2W2D3.entities.Città;
import JAVAU2W2D3.exceptions.BadRequestException;
import JAVAU2W2D3.exceptions.NotFoundException;
import JAVAU2W2D3.payloads.CittàRegistrationPayload;
import JAVAU2W2D3.repositories.CittàRepository;

@Service
public class CittàService {
	@Autowired
	private CittàRepository cittaRepo;

	public Città create(CittàRegistrationPayload c) {
		cittaRepo.findByNomeIgnoreCase(c.getNome()).ifPresent(Città -> {
			throw new BadRequestException("Citta" + Città.getNome() + " presente!");
		});
		Città newCitta = new Città(c.getNome());
		return cittaRepo.save(newCitta);
	}

	public Page<Città> find(int page, int size, String sortBy) {
		if (size < 0)
			size = 10;
		if (size > 100)
			size = 100;
		Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));

		return cittaRepo.findAll(pageable);
	}

	public Città findById(UUID id) throws NotFoundException {
		return cittaRepo.findById(id).orElseThrow(() -> new NotFoundException("Utente non trovato!"));
	}

	public Città findByIdAndUpdate(UUID id, Città c) throws NotFoundException {
		Città found = this.findById(id);

		found.setId(id);
		found.setNome(c.getNome());

		return cittaRepo.save(found);
	}

	public void findByIdAndDelete(UUID id) throws NotFoundException {
		Città found = this.findById(id);
		cittaRepo.delete(found);
	}
}
