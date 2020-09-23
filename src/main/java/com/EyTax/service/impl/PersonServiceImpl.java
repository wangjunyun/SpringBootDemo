package com.EyTax.service.impl;

import com.EyTax.dao.PersonDao;
import com.EyTax.entity.Person;
import com.EyTax.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public List<Person> getAll() {
        return personDao.getAll();
    }

    @Override
    public Person getPersonById(int id) {
        return personDao.getPersonById(id);
    }

    @Override
    public void delete(int id) {
        personDao.delete(id);
    }

    @Override
    public void update(Person person) {
        personDao.update(person);
    }

    @Override
    public void add(Person person) {
        personDao.add(person);
    }
}
