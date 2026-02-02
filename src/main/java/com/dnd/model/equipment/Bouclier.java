package com.dnd.model.equipment;

public final class Bouclier extends EquipementDefensif {

    public Bouclier(String name, int defenseBonus) {
        super(name, defenseBonus);
    }

    @Override
    public String toString() {
        return "Bouclier : " + getName() + ", Défense +" + getDefenseBonus();
    }
}
