package com.dnd.model.equipment;

import com.dnd.board.Case;

public final class Sort extends EquipementOffensif implements Case {

    public Sort(String name, int attackBonus) {
        super(name, attackBonus);
    }

    @Override
    public String describe() {
        return toString();
    }

    @Override
    public String toString() {
        return "Sort : " + getName() + ", Attaque +" + getAttackBonus();
    }
}
