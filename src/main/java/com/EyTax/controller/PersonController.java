package com.EyTax.controller;

import com.EyTax.entity.Person;
import com.EyTax.service.impl.PersonServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    public static Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    private PersonServiceImpl personService;

    @PostMapping("/getAll")
    public List<Person> getAll() {
        List<Person> list = personService.getAll();
        return list;
    }

    @RequestMapping("/getPerson")
    public ModelAndView index() {
        logger.info("999999999999999999999999");
        ModelAndView view = new ModelAndView("index");
        List<Person> list = personService.getAll();
        view.addObject("list",list);
        return view;
    }
}
