package com.dnd.game;

import com.dnd.board.Case;
import com.dnd.board.Plateau;
import com.dnd.model.character.Personnage;

import java.util.Objects;

public final class Game {

    private final Dice dice;
    private final Plateau plateau;

    private Personnage player;
    private int playerPosition;

    public Game(Dice dice, Plateau plateau) {
        this.dice = Objects.requireNonNull(dice);
        this.plateau = Objects.requireNonNull(plateau);
    }

    public int getBoardSize() {
        return plateau.size();
    }

    public void startNewGame(Personnage player) {
        this.player = Objects.requireNonNull(player);
        this.playerPosition = 1;
    }

    public boolean isRunning() {
        return player != null && playerPosition < getBoardSize();
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public Case getCurrentCase() {
        requireGameStarted();
        return plateau.getCaseAt(playerPosition);
    }

    public TurnOutcome playOneTurn() throws PersonnageHorsPlateauException {
        requireGameStarted();

        int roll = dice.roll();
        int nextPosition = playerPosition + roll;

        if (nextPosition > getBoardSize()) {
            throw new PersonnageHorsPlateauException(playerPosition, nextPosition, getBoardSize());
        }

        playerPosition = nextPosition;
        return new TurnOutcome(roll, playerPosition, getCurrentCase());
    }

    public boolean hasWon() {
        requireGameStarted();
        return playerPosition >= getBoardSize();
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
