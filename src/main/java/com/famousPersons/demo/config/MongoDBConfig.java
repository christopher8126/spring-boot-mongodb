package com.famousPersons.demo.config;

import com.famousPersons.demo.repository.FamousPersonRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = FamousPersonRepository.class)
@Configuration
public class MongoDBConfig {
}
