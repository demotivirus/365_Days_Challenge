package com.demotivirus.Day_159;

import com.demotivirus.Day_159.abstract_factory.FactoryMaker;
import com.demotivirus.Day_159.abstract_factory.KingdomType;
import com.demotivirus.Day_159.army.Army;
import com.demotivirus.Day_159.factorys.KingdomFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("====================");

        log.info("Create elf kingdom");
        KingdomFactory elfFactory = FactoryMaker.createFactory(KingdomType.ELF);
        log.info(elfFactory.createArmy().getDescription());
        log.info(elfFactory.createKing().getDescription());
        log.info(elfFactory.createCastle().getDescription());

        log.info("====================");

        log.info("Create orc kingdom");
        KingdomFactory orcFactory = FactoryMaker.createFactory(KingdomType.ORC);
        log.info(orcFactory.createArmy().getDescription());
        log.info(orcFactory.createCastle().getDescription());
        log.info(orcFactory.createKing().getDescription());

        log.info("====================");
    }
}
