package com.example.springbootwebapp.controller;


import com.example.springbootwebapp254.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository eRepo;

    @GetMapping
    public ModelAndView showEmployees() {
        ModelAndView mav = new ModelAndView("listemployees");
        List<Employee> list = eRepo.findAll();
        mav.addObject("employees", list);
        return mav;
    }
}
