package com.demotivirus.Day_136;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class People {
    @NonNull
    private String name;
    @NonNull
    private byte age;

    private Money money;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age && Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Money getMoney() {
        if (this.money == null)
            money = new Money();
        return money;
    }

    public void addMoney(int value) {
        this.money.addMoney(value);
    }

    public void divisionMoney(int value) {
        this.money.divisionMoney(value);
    }

    public int checkBalance() {
        return this.money.getValue();
    }
}
