package com.example.demo.api;
import java.util.List;

import com.example.demo.model.Person;
import com.example.demo.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
    @Autowired
    PersonServiceImpl service;

    @GetMapping("/persons")
    public List<Person> getAllUsers(){
        return service.getAll();
    }

    @PostMapping("/persons")
    public Person addOne(@RequestBody Person person) {
        return service.addToList(person);
    }



    @DeleteMapping(value = "/persons/{Id}")
    public String deleteOne(@PathVariable Integer Id) {
        return service.delete(Id);
    }


    @PutMapping("/persons")
    public String updatePerson(@RequestBody Person person) {
        return service.UpdatePersonList(person);

    }

//    @GetMapping("/persons/search")
//    public List<Person> FindByid(@RequestParam("id")  int id)
//    {
//        return personRepository.findById(id);
//    }
//    @GetMapping("/persons/search")
//    public List<Person> FindByname(@RequestParam("name")  String name)
//    {
//        return personRepository.findByName(name);
//    }



}