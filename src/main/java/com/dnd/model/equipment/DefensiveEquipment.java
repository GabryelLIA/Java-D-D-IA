package com.dnd.model.equipment;

import java.util.Objects;

public class DefensiveEquipment {

    private final DefensiveType type;
    private final String name;
    private final int defenseBonus;

    public DefensiveEquipment(DefensiveType type, String name, int defenseBonus) {
        this.type = Objects.requireNonNull(type);
        this.name = requireNonBlank(name);
        this.defenseBonus = defenseBonus;
    }

    public DefensiveType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getDefenseBonus() {
        return defenseBonus;
    }

    @Override
    public String toString() {
        return String.format("%s{name='%s', defenseBonus=%d}", type, name, defenseBonus);
    }

    private static String requireNonBlank(String value) {
        Objects.requireNonNull(value);
        if (value.isBlank()) {
            throw new IllegalArgumentException("name must not be blank");
        }
        return value;
    }
}
