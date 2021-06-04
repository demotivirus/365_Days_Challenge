package com.demotivirus.Day_159.factorys;

import com.demotivirus.Day_159.army.Army;
import com.demotivirus.Day_159.army.ElfArmy;
import com.demotivirus.Day_159.castle.Castle;
import com.demotivirus.Day_159.castle.ElfCastle;
import com.demotivirus.Day_159.king.ElfKing;
import com.demotivirus.Day_159.king.King;

public class ElfKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }

    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Army createArmy() {
        return new ElfArmy();
    }
}
