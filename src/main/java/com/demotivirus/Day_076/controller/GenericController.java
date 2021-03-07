package com.demotivirus.Day_076.controller;

import com.demotivirus.Day_076.entity.AbstractLanguage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface GenericController<E extends AbstractLanguage> {
    @PostMapping
    ResponseEntity<E> save(@RequestBody E e);
}
