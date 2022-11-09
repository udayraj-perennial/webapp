package com.perennial.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/domains")
public class DomainController {
    @Autowired
    DomainRepository domainRepository;

    @GetMapping
    public ResponseEntity<List<Domain>> getAll() {
        return new ResponseEntity<>(domainRepository.findAll(), HttpStatus.OK);
    }
}
