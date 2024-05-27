package com.stl.app.restApi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stl.app.restApi.model.Address;
import com.stl.app.restApi.model.Person;
import com.stl.app.restApi.repo.AddressRepository;
import com.stl.app.restApi.repo.PersonRepository;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    private final AddressRepository addressRepository;

    @Autowired
    public PersonService(PersonRepository personRepository, AddressRepository addressRepository) {
        this.personRepository = personRepository;
        this.addressRepository = addressRepository;
    }

    public void savePerson(Person person) {
        Address address = person.getAddress();
        addressRepository.save(address);

        personRepository.save(person);
        
            }
    
  public List<Person> getAllDetails()
  {
  	return personRepository.findAll();
  }
}

//@Service
//public class PersonService {
//    private final PersonRepository personRepository;
//    private final AddressRepository addressRepository;
//
//    public PersonService(PersonRepository personRepository, AddressRepository addressRepository) {
//        this.personRepository = personRepository;
//        this.addressRepository = addressRepository;
//    }
//
//    public void savePerson(Person person) {
//        Address permanentAddress = person.getPermanentAddress();
//        Address currentAddress = person.getCurrentAddress();
//
//        addressRepository.save(permanentAddress);
//        addressRepository.save(currentAddress);
//
//        personRepository.save(person);
//    }
//    
//    public List<Person> getAllDetails()
//    {
//    	return personRepository.findAll();
//    }
//}


