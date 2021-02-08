package com.demotivirus.Day_049.dao;

import com.demotivirus.Day_049.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface CourseDao extends JpaRepository<Course, Long> {
}
