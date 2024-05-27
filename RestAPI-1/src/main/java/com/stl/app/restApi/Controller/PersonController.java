package com.stl.app.restApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stl.app.restApi.model.Person;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/save")
    public void savePerson(@RequestBody Person person) {
        personService.savePerson(person);
    }
    
  @GetMapping(value = "/get")
	public List<Person> getUsers()
	{
		return personService.getAllDetails();
	}
    
}

//@RestController
//@RequestMapping("/api/person")
//public class PersonController {
//
//    private final PersonService personService;
//
//    @Autowired
//    public PersonController(PersonService personService) {
//        this.personService = personService;
//    }
//
//    @PostMapping("/save")
//    public void savePerson(@RequestBody Person person) {
//        personService.savePerson(person);
//    }
//    
//    @GetMapping(value = "/get")
//	public List<Person> getUsers()
//	{
//		return personService.getAllDetails();
//	}
//	
//}

