package com.EyTax.dao;

import com.EyTax.entity.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonDao {

    List<Person> getAll();

    Person getPersonById(int id);

    void delete(int id);

    void update(Person person);

    void add(Person person);

}
