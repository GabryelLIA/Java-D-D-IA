package com.dnd.model;

import com.dnd.model.equipment.DefensiveEquipment;
import com.dnd.model.equipment.DefensiveType;
import com.dnd.model.equipment.OffensiveEquipment;
import com.dnd.model.equipment.OffensiveType;

import java.util.Objects;

public class Personnage {

    private static final int DEFAULT_WARRIOR_LIFE = 10;
    private static final int DEFAULT_WARRIOR_ATTACK = 10;

    private static final int DEFAULT_WIZARD_LIFE = 6;
    private static final int DEFAULT_WIZARD_ATTACK = 15;

    private CharacterType type;
    private String name;
    private int lifePoints;
    private int baseAttack;

    private OffensiveEquipment offensiveEquipment;
    private DefensiveEquipment defensiveEquipment;

    public Personnage() {
        this(CharacterType.WARRIOR, "Unknown");
    }

    public Personnage(String name) {
        this(CharacterType.WARRIOR, name);
    }

    public Personnage(CharacterType type, String name) {
        this.type = Objects.requireNonNull(type);
        this.name = requireNonBlank(name);
        applyTypeDefaults(type);
    }

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = Objects.requireNonNull(type);
        applyTypeDefaults(type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = requireNonBlank(name);
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        if (lifePoints < 0) {
            throw new IllegalArgumentException("lifePoints must be >= 0");
        }
        this.lifePoints = lifePoints;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        if (baseAttack < 0) {
            throw new IllegalArgumentException("baseAttack must be >= 0");
        }
        this.baseAttack = baseAttack;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = Objects.requireNonNull(offensiveEquipment);
    }

    public DefensiveEquipment getDefensiveEquipment() {
        return defensiveEquipment;
    }

    public void setDefensiveEquipment(DefensiveEquipment defensiveEquipment) {
        this.defensiveEquipment = Objects.requireNonNull(defensiveEquipment);
    }

    public int getTotalAttack() {
        return baseAttack + (offensiveEquipment == null ? 0 : offensiveEquipment.getAttackBonus());
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", lifePoints=" + lifePoints +
                ", baseAttack=" + baseAttack +
                ", totalAttack=" + getTotalAttack() +
                ", offensiveEquipment=" + offensiveEquipment +
                ", defensiveEquipment=" + defensiveEquipment +
                '}';
    }

    private void applyTypeDefaults(CharacterType type) {
        switch (type) {
            case WARRIOR -> {
                this.lifePoints = DEFAULT_WARRIOR_LIFE;
                this.baseAttack = DEFAULT_WARRIOR_ATTACK;
                this.offensiveEquipment = new OffensiveEquipment(OffensiveType.WEAPON, "Basic Weapon", 0);
                this.defensiveEquipment = new DefensiveEquipment(DefensiveType.SHIELD, "Basic Shield", 0);
            }
            case WIZARD -> {
                this.lifePoints = DEFAULT_WIZARD_LIFE;
                this.baseAttack = DEFAULT_WIZARD_ATTACK;
                this.offensiveEquipment = new OffensiveEquipment(OffensiveType.SPELL, "Basic Spell", 0);
                this.defensiveEquipment = new DefensiveEquipment(DefensiveType.PHILTER, "Basic Philter", 0);
            }
        }
    }

    private static String requireNonBlank(String value) {
        Objects.requireNonNull(value);
        if (value.isBlank()) {
            throw new IllegalArgumentException("name must not be blank");
        }
        return value;
    }
}
