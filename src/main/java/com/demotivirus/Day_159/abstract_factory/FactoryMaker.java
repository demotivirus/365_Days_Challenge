package com.demotivirus.Day_159.abstract_factory;

import com.demotivirus.Day_159.factorys.ElfKingdomFactory;
import com.demotivirus.Day_159.factorys.KingdomFactory;
import com.demotivirus.Day_159.factorys.OrcKingdomFactory;

public class FactoryMaker {
    public static KingdomFactory createFactory(KingdomType kingdomType) {
        switch (kingdomType) {
            case ELF: return new ElfKingdomFactory();
            case ORC: return new OrcKingdomFactory();
            default: throw new IllegalArgumentException("KingdomType not found");
        }
    }
}
