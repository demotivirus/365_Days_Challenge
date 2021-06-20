package com.demotivirus.Day_174;

import lombok.ToString;

@ToString
public class GourmetToppingFactory extends BaseToppingFactory {
    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce createSauce() {
        return new OliveSauce();
    }
}
