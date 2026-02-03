package com.dnd;

import com.dnd.board.CaseVide;
import com.dnd.board.Ennemi;
import com.dnd.board.Plateau;
import com.dnd.board.Potion;
import com.dnd.db.ConnectionProvider;
import com.dnd.db.DbConfig;
import com.dnd.db.DbConfigLoader;
import com.dnd.db.HeroRepository;
import com.dnd.db.JdbcHeroRepository;
import com.dnd.game.FixedDice;
import com.dnd.game.Game;
import com.dnd.menu.Menu;
import com.dnd.model.equipment.Arme;

import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Iteration 4 asks for a simplified board (4 tiles) and a fixed dice (always 1) for easier testing.
        Plateau plateau = Plateau.plateauDemo4Cases(
                new CaseVide(),
                new Ennemi("Gobelin", 6, 2),
                new Arme("Massue", 3),
                new Potion("Potion de vie", 2)
        );

        Game game = new Game(new FixedDice(1), plateau);

        try {
            DbConfig config = new DbConfigLoader("db/db.properties").load();
            HeroRepository heroRepository = new JdbcHeroRepository(new ConnectionProvider(config));
            new Menu(heroRepository).run(scanner, game);
        } catch (RuntimeException ex) {
            System.out.println("Unable to start (DB config missing/invalid).\n" +
                    "Create src/main/resources/db/db.properties from db/db.properties.example (or set DB_URL/DB_USER/DB_PASSWORD env vars).\n" +
                    "Details: " + ex.getMessage());
        }
    }
}
