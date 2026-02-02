package com.dnd.game;

import com.dnd.model.character.Personnage;

import java.util.Objects;

public final class Game {

    public static final int BOARD_SIZE = 64;

    private final Dice dice;

    private Personnage player;
    private int playerPosition;

    public Game(Dice dice) {
        this.dice = Objects.requireNonNull(dice);
    }

    public void startNewGame(Personnage player) {
        this.player = Objects.requireNonNull(player);
        this.playerPosition = 1;
    }

    public boolean isRunning() {
        return player != null && playerPosition < BOARD_SIZE;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public int playOneTurn() throws PersonnageHorsPlateauException {
        requireGameStarted();

        int roll = dice.roll();
        int nextPosition = playerPosition + roll;

        if (nextPosition > BOARD_SIZE) {
            throw new PersonnageHorsPlateauException(playerPosition, nextPosition, BOARD_SIZE);
        }

        playerPosition = nextPosition;
        return roll;
    }

    public boolean hasWon() {
        requireGameStarted();
        return playerPosition >= BOARD_SIZE;
    }

    public void endGame() {
        player = null;
        playerPosition = 0;
    }

    private void requireGameStarted() {
        if (player == null) {
            throw new IllegalStateException("Game not started");
        }
    }
}
