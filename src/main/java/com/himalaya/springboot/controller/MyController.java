package com.himalaya.springboot.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.himalaya.springboot.dto.MyDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MyController {

    @PostMapping("/my")
    public MyDto findMyDto(@RequestBody MyDto my) throws JsonProcessingException {
        log.info("###### MyController.findMyDto request info :: " + my);

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(my);
        System.out.println("s = " + s);
        return my;
    }
}
