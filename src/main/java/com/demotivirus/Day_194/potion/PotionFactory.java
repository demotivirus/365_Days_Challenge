package com.demotivirus.Day_194.potion;

import java.util.EnumMap;
import java.util.Map;

public class PotionFactory {
    private final Map<PotionType, Potion> potions;
    private Potion potion;

    public PotionFactory() {
        this.potions = new EnumMap<>(PotionType.class);
    }

    public Potion createPotion(PotionType type) {
        this.potion = potions.get(type);
        if (potion == null) {
            switch (type) {
                case HEALING -> putPotion(type, new HealingPotion());
                case HOLY_WATER -> putPotion(type, new HolyWaterPotion());
                case INVISIBILITY -> putPotion(type, new InvisibilityPotion());
                default -> putPotion(type, new DefaultPotion());
            }
        }
        return potion;
    }

    private void putPotion(PotionType type, Potion potion) {
        this.potion = potion;
        potions.put(type, potion);
    }
}
