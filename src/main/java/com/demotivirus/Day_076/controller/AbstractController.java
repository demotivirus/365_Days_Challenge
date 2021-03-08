package com.demotivirus.Day_076.controller;

import com.demotivirus.Day_076.entity.AbstractLanguage;
import com.demotivirus.Day_076.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class AbstractController
        <E extends AbstractLanguage, S extends GenericService<E>>
        implements GenericController<E>{

    private final S s;

    @Autowired
    protected AbstractController(S s) {
        this.s = s;
    }

    @Override
    public ResponseEntity<E> save(@RequestBody E e){
        s.save(e);
        return (ResponseEntity<E>) ResponseEntity.ok();
    }
}
