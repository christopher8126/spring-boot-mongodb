package com.famousPersons.demo.repository;

import com.famousPersons.demo.document.FamousPerson;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FamousPersonRepository extends MongoRepository<FamousPerson, String> {

//    database functions here



}
