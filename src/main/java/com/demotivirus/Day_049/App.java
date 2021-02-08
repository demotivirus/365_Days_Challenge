package com.demotivirus.Day_049;

import com.demotivirus.Day_049.dao.StudentDao;
import com.demotivirus.Day_049.model.Course;
import com.demotivirus.Day_049.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
    @Autowired
    private StudentDao studentDao;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) {
        // Create a couple of Book and Publisher
        //bookRepository.save(new Book("Book 1", new Publisher("Publisher A"), new Publisher("Publisher B")));
        studentDao.saveAndFlush(new Student(new Course("One"), new Course("Two")));
    }
}
