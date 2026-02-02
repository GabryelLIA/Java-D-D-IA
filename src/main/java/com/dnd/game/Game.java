package com.dnd.game;

import com.dnd.model.Personnage;

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

    public int playOneTurn() {
        requireGameStarted();

        int roll = dice.roll();
        int nextPosition = playerPosition + roll;
        playerPosition = Math.min(nextPosition, BOARD_SIZE);

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
