package com.dnd.model.equipment;

import com.dnd.board.Case;

public final class Arme extends EquipementOffensif implements Case {

    public Arme(String name, int attackBonus) {
        super(name, attackBonus);
    }

    @Override
    public String describe() {
        return toString();
    }

    @Override
    public String toString() {
        return "Arme : " + getName() + ", Attaque +" + getAttackBonus();
    }
}
