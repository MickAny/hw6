package gb.hw6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);


		Game game = new Game(100);

		System.out.println("-".repeat(30));

		System.out.println("Статистика побед\n" +
				"1 - с первой попытки " + Collections.frequency(game.statistic, 1) + "%\n" +
				"2 - поменял дверь " + Collections.frequency(game.statistic, 2) + "%\n" +
				"3 - не изменил решение " + Collections.frequency(game.statistic, 3) +"%");
		System.out.println(game.statistic);

	}

}
