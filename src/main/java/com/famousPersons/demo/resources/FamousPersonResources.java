package com.famousPersons.demo.resources;


import com.famousPersons.demo.document.FamousPerson;
import com.famousPersons.demo.repository.FamousPersonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("api/famous-person")
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FamousPersonResources {

    private final FamousPersonRepository famousPersonRepository;

    public FamousPersonResources(FamousPersonRepository famousPersonRepository) {
        this.famousPersonRepository = famousPersonRepository;
    }

    @GetMapping
    public List<FamousPerson> getAll(){
        return this.famousPersonRepository.findAll();
//        return list;
    }

    @GetMapping(path = "{id}")
    public Optional<FamousPerson> selectOne(@PathVariable("id") String id){
        return this.famousPersonRepository.findById(id);
    }

    @PostMapping
    public FamousPerson addFamousPerson( @RequestBody FamousPerson famousPerson){
        return this.famousPersonRepository.insert(famousPerson);
    }

    @PutMapping
    public FamousPerson updateFamousPerson(@RequestBody FamousPerson famousPerson){
        return this.famousPersonRepository.save(famousPerson);
    }



    @DeleteMapping(path = "{id}")
    public void deleteFamousPerson(@PathVariable("id") String id){
        this.famousPersonRepository.deleteById(id);
    }

}
