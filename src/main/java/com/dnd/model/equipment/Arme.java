package com.dnd.model.equipment;

public final class Arme extends EquipementOffensif {

    public Arme(String name, int attackBonus) {
        super(name, attackBonus);
    }

    @Override
    public String toString() {
        return "Arme : " + getName() + ", Attaque +" + getAttackBonus();
    }
}
