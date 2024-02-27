package com.takima.backskeleton.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RequestMapping("error")
@RestController
@RequiredArgsConstructor
public class ErrorController {
    @GetMapping("")
    public String error() {return "An error occured";}
}
