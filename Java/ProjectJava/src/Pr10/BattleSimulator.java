package Pr10;

import java.util.EnumMap;

public class BattleSimulator {
    public static void main(String[] args) {
        EnumMap<UnitType, Unit> army = new EnumMap<>(UnitType.class);

        army.put(UnitType.WARRIOR, new Warrior("Thorin"));
        army.put(UnitType.MAGE, new Mage("Gandalf"));
        army.put(UnitType.ARCHER, new Archer("Legolas"));

        for (UnitType type : UnitType.values()) {
            Unit unit = army.get(type);
            unit.report();
            unit.attack();
            unit.defend();
            System.out.println();
        }
    }
}
