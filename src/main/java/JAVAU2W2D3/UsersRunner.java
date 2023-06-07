//package JAVAU2W2D3;
//
//import java.util.Locale;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.github.javafaker.Faker;
//
//import entities.User;
//import services.UsersService;
//
//@Component
//public class UsersRunner implements CommandLineRunner {
//	@Autowired
//	UsersService usersService;
//
//	@Override
//	public void run(String... args) throws Exception {
//		Faker faker = new Faker(new Locale("it"));
//		for (int i = 0; i < 3; i++) {
//			try {
//
//				String name = faker.name().firstName();
//				String surname = faker.name().lastName();
//				String email = faker.internet().emailAddress();
//				User user = new User(name, surname, email);
////				usersService.create(user);
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//		}
//
//	}
//
//}
