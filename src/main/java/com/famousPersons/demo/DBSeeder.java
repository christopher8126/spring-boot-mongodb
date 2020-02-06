package com.famousPersons.demo;

import com.famousPersons.demo.document.FamousPerson;
import com.famousPersons.demo.repository.FamousPersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DBSeeder implements CommandLineRunner {
    private FamousPersonRepository famousPersonRepository;

    public DBSeeder(FamousPersonRepository famousPersonRepository) {
        this.famousPersonRepository = famousPersonRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
