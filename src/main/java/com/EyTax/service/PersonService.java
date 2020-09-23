package com.EyTax.service;

import com.EyTax.entity.Person;

import java.util.List;

public interface PersonService {

    List<Person> getAll();

    Person getPersonById(int id);

    void delete(int id);

    void update(Person person);

    void add(Person person);
}
