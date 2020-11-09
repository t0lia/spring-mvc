package com.apozdniakov.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping(headers="Accept=application/json")
    @ResponseBody
    public Item printHello() {
        Item item = new Item();
        item.setId(1);
        item.setName("fst");
        return item;
    }

}

