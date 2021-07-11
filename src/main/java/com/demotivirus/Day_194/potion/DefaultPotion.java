package com.demotivirus.Day_194.potion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultPotion implements Potion {
    @Override
    public void drink() {
      log.info("Nothing to do... Potion={}", System.identityHashCode(this));
    }
}
