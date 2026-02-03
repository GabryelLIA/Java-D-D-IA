package com.dnd;

import com.dnd.board.CaseVide;
import com.dnd.board.Ennemi;
import com.dnd.board.Plateau;
import com.dnd.board.Potion;
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

        new Menu().run(scanner, game);
    }
}
