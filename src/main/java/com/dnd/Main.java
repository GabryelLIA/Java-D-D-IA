package com.dnd;

import com.dnd.game.Game;
import com.dnd.game.RandomDice;
import com.dnd.menu.Menu;

import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game(new RandomDice());

        new Menu().run(scanner, game);
    }
}
