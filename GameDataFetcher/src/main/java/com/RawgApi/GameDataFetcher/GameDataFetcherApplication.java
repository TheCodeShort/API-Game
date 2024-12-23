package com.RawgApi.GameDataFetcher;




import com.RawgApi.GameDataFetcher.Principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameDataFetcherApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GameDataFetcherApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal principal = new Principal();
		principal.mostrarInformacion();
	}
}
