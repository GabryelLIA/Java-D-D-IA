package com.dnd.model.equipment;

public final class Philtre extends EquipementDefensif {

    public Philtre(String name, int defenseBonus) {
        super(name, defenseBonus);
    }

    @Override
    public String toString() {
        return "Philtre : " + getName() + ", Défense +" + getDefenseBonus();
    }
}
