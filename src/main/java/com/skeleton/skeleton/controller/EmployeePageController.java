package com.skeleton.skeleton.controller;

import org.jmorla.viewdescriptor.View;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@View(
    title = "Skeleton | Employees",
    entryPoint = "employees.jsx",
    scripts = "employees.js",
    stylesheets = "employees.css"
)
@Controller
@RequestMapping("/employees")
public class EmployeePageController extends AbstractPage {

    @GetMapping
    public ModelAndView handleGet(ModelAndView model) {
        return model;
    }

    @Override
    public String getDescriptorName() {
        return getClass().getCanonicalName();
    }
}
