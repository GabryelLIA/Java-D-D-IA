package com.dnd.model.equipment;

public final class Sort extends EquipementOffensif {

    public Sort(String name, int attackBonus) {
        super(name, attackBonus);
    }

    @Override
    public String toString() {
        return "Sort : " + getName() + ", Attaque +" + getAttackBonus();
    }
}
