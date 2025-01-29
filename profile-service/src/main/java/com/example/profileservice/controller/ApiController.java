package com.example.profileservice.controller;

import com.example.profileservice.dto.request.CreateRq;
import com.example.profileservice.dto.response.ProfileRs;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/profiles")
public interface ApiController {

    @GetMapping("/getByUserId/{id}")
    ProfileRs getByUserId(@PathVariable String id);

    @GetMapping("/getByProfileId/{id}")
    ProfileRs getByProfileId(@PathVariable String id);

    @PostMapping("/create")
    ProfileRs create(@RequestBody CreateRq request);
}
