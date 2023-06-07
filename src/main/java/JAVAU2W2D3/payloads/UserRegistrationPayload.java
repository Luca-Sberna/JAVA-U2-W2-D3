package JAVAU2W2D3.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter
public class UserRegistrationPayload {
	@NotNull(message = "Il nome è obbligatorio")
	@Size(min = 3, max = 30)
	String name;
	@NotNull
	String surname;
	@Email(message = "Non hai inserito un indirizzo email valido")
	String email;

	public UserRegistrationPayload(@NotNull(message = "Il nome è obbligatorio") @Size(min = 3, max = 30) String name,
			@NotNull String surname, @Email(message = "Non hai inserito un indirizzo email valido") String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
	}
}
