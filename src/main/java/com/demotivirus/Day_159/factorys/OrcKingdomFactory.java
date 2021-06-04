package com.demotivirus.Day_159.factorys;

import com.demotivirus.Day_159.army.Army;
import com.demotivirus.Day_159.army.OrcArmy;
import com.demotivirus.Day_159.castle.Castle;
import com.demotivirus.Day_159.castle.OrcCastle;
import com.demotivirus.Day_159.king.King;
import com.demotivirus.Day_159.king.OrcKing;

public class OrcKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }

    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Army createArmy() {
        return new OrcArmy();
    }
}
