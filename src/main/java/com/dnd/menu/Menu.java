package com.dnd.menu;

import com.dnd.game.Game;
import com.dnd.game.PersonnageHorsPlateauException;
import com.dnd.model.CharacterType;
import com.dnd.model.character.Guerrier;
import com.dnd.model.character.Magicien;
import com.dnd.model.character.Personnage;

import java.util.Scanner;

public final class Menu {

    public void run(Scanner scanner, Game game) {
        boolean running = true;

        while (running) {
            printMainMenu();
            int choice = readInt(scanner, "Your choice: ");

            switch (choice) {
                case 1 -> running = handleCreateAndManageCharacter(scanner, game);
                case 2 -> running = false;
                default -> System.out.println("Invalid choice. Try again.");
            }
        }

        System.out.println("Bye.");
    }

    private boolean handleCreateAndManageCharacter(Scanner scanner, Game game) {
        Personnage character = createCharacter(scanner);

        boolean managing = true;
        while (managing) {
            printCharacterMenu(character);
            int choice = readInt(scanner, "Your choice: ");

            switch (choice) {
                case 1 -> System.out.println(character);
                case 2 -> character = editCharacter(scanner, character);
                case 3 -> playGame(scanner, game, character);
                case 4 -> managing = false;
                case 5 -> {
                    return false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }

        return true;
    }

    private Personnage createCharacter(Scanner scanner) {
        CharacterType type = readCharacterType(scanner);
        String name = readNonBlankString(scanner, "Name: ");

        Personnage personnage = newPersonnage(type, name);
        System.out.println("Character created.");
        System.out.println(personnage);

        return personnage;
    }

    private Personnage editCharacter(Scanner scanner, Personnage character) {
        System.out.println("Edit character");
        System.out.println("1) Change name");
        System.out.println("2) Change type (creates a new character with same name)");
        System.out.println("3) Back");

        int choice = readInt(scanner, "Your choice: ");
        switch (choice) {
            case 1 -> {
                character.setName(readNonBlankString(scanner, "New name: "));
                System.out.println("Updated character:");
                System.out.println(character);
                return character;
            }
            case 2 -> {
                CharacterType newType = readCharacterType(scanner);
                Personnage newCharacter = newPersonnage(newType, character.getName());
                System.out.println("Updated character:");
                System.out.println(newCharacter);
                return newCharacter;
            }
            case 3 -> {
                return character;
            }
            default -> {
                System.out.println("Invalid choice.");
                return character;
            }
        }
    }

    private void playGame(Scanner scanner, Game game, Personnage character) {
        game.startNewGame(character);

        System.out.printf("Starting game. You are on tile %d/%d.%n", game.getPlayerPosition(), Game.BOARD_SIZE);

        while (game.isRunning()) {
            readLine(scanner, "Press ENTER to roll the dice...");

            try {
                int roll = game.playOneTurn();
                System.out.printf("You rolled %d. You are now on tile %d/%d.%n",
                        roll,
                        game.getPlayerPosition(),
                        Game.BOARD_SIZE
                );
            } catch (PersonnageHorsPlateauException ex) {
                System.out.printf("Roll would move you out of the board (%d -> %d). You stay on tile %d/%d.%n",
                        ex.getCurrentPosition(),
                        ex.getAttemptedPosition(),
                        ex.getCurrentPosition(),
                        Game.BOARD_SIZE
                );
            }
        }

        if (game.hasWon()) {
            System.out.println("You reached the end of the board. You win!");
        }

        game.endGame();

        System.out.println("1) Play again");
        System.out.println("2) Back to character menu");

        int choice = readInt(scanner, "Your choice: ");
        if (choice == 1) {
            playGame(scanner, game, character);
        }
    }

    private void printMainMenu() {
        System.out.println("=== D&D (Iteration 3) ===");
        System.out.println("1) New character");
        System.out.println("2) Quit");
    }

    private void printCharacterMenu(Personnage character) {
        System.out.println("=== Character ===");
        System.out.println("Current: " + character.getName() + " (" + character.getType() + ")");
        System.out.println("1) Show character info");
        System.out.println("2) Edit character");
        System.out.println("3) Start game");
        System.out.println("4) Back to main menu");
        System.out.println("5) Quit");
    }

    private CharacterType readCharacterType(Scanner scanner) {
        while (true) {
            System.out.println("Choose type:");
            System.out.println("1) Warrior");
            System.out.println("2) Wizard");

            int choice = readInt(scanner, "Your choice: ");
            switch (choice) {
                case 1 -> {
                    return CharacterType.WARRIOR;
                }
                case 2 -> {
                    return CharacterType.WIZARD;
                }
                default -> System.out.println("Invalid type. Try again.");
            }
        }
    }

    private Personnage newPersonnage(CharacterType type, String name) {
        return switch (type) {
            case WARRIOR -> new Guerrier(name);
            case WIZARD -> new Magicien(name);
        };
    }

    private int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a number.");
            }
        }
    }

    private String readNonBlankString(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();

            if (!input.isBlank()) {
                return input;
            }

            System.out.println("Input must not be blank.");
        }
    }

    private void readLine(Scanner scanner, String prompt) {
        System.out.print(prompt);
        scanner.nextLine();
    }
}
