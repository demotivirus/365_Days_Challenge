package com.demotivirus.Day_159.factorys;

import com.demotivirus.Day_159.army.Army;
import com.demotivirus.Day_159.castle.Castle;
import com.demotivirus.Day_159.king.King;

public interface KingdomFactory {
    Castle createCastle();
    King createKing();
    Army createArmy();
}
