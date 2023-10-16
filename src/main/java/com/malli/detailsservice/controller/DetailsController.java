package com.malli.detailsservice.controller;

import com.malli.detailsservice.service.DetailsService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/details")
@Tag(name = "DetailsController", description = "Details management APIs")
public class DetailsController {

    @Autowired
    private DetailsService detailsService;

    @GetMapping("/status")
    public String showStatus() {
        return "Details application is Running";
    }

    @GetMapping
    public String getDetails() {
        return "Fetching Details from source";
    }

}
