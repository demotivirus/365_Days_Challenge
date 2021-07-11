package com.demotivirus.Day_194;

import com.demotivirus.Day_194.potion.Potion;
import com.demotivirus.Day_194.potion.PotionFactory;
import com.demotivirus.Day_194.potion.PotionType;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class AlchemistShop {
    private final List<Potion> topShelf;
    private final List<Potion> bottomShelf;

    public AlchemistShop() {
        var factory = new PotionFactory();
        topShelf = List.of(
                factory.createPotion(PotionType.INVISIBILITY),
                factory.createPotion(PotionType.INVISIBILITY),
                factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.INVISIBILITY),
                factory.createPotion(PotionType.HEALING),
                factory.createPotion(PotionType.HEALING)
        );
        bottomShelf = List.of(
                factory.createPotion(PotionType.HOLY_WATER),
                factory.createPotion(PotionType.HOLY_WATER),
                factory.createPotion(PotionType.HOLY_WATER),
                factory.createPotion(PotionType.HOLY_WATER),
                factory.createPotion(PotionType.HOLY_WATER),
                factory.createPotion(PotionType.HOLY_WATER),
                factory.createPotion(PotionType.HOLY_WATER),
                factory.createPotion(PotionType.HOLY_WATER)
        );
    }

    public final List<Potion> getTopShelf() {
        return List.copyOf(this.topShelf);
    }

    public final List<Potion> getBottomShelf() {
        return List.copyOf(this.bottomShelf);
    }

    public void drinkAllPotions() {
        log.info("Drinking top shelf potions");
        topShelf.forEach(Potion::drink);
        log.info("Drinking bottom shelf potions");
        bottomShelf.forEach(Potion::drink);
    }
}
