package com.dnd.model.equipment;

import java.util.Objects;

public class OffensiveEquipment {

    private final OffensiveType type;
    private final String name;
    private final int attackBonus;

    public OffensiveEquipment(OffensiveType type, String name, int attackBonus) {
        this.type = Objects.requireNonNull(type);
        this.name = requireNonBlank(name);
        this.attackBonus = attackBonus;
    }

    public OffensiveType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    @Override
    public String toString() {
        return String.format("%s{name='%s', attackBonus=%d}", type, name, attackBonus);
    }

    private static String requireNonBlank(String value) {
        Objects.requireNonNull(value);
        if (value.isBlank()) {
            throw new IllegalArgumentException("name must not be blank");
        }
        return value;
    }
}
