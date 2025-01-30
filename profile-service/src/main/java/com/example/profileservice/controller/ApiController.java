package com.example.profileservice.controller;

import com.example.profileservice.dto.request.CreateRq;
import com.example.profileservice.dto.request.UpdateRq;
import com.example.profileservice.dto.response.ProfileRs;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/api/v1/profiles")
public interface ApiController {

    @GetMapping("/getByProfileId/{id}")
    ProfileRs getByProfileId(@PathVariable String id);

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    ProfileRs create(@RequestBody CreateRq request);

    @PatchMapping("/update")
    ProfileRs update(@RequestBody UpdateRq request);

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable String id);
}
