package com.demotivirus.Day_076.dao;

import com.demotivirus.Day_076.entity.AbstractLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericDao<E extends AbstractLanguage> extends JpaRepository<E, Long> {
}
