package com.eliseubrito.personapi.service;

import com.eliseubrito.personapi.dto.MessageResponseDTO;
import com.eliseubrito.personapi.dto.request.PersonDTO;
import com.eliseubrito.personapi.mapper.PersonMapper;
import com.eliseubrito.personapi.model.Person;
import com.eliseubrito.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);
        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }

}
