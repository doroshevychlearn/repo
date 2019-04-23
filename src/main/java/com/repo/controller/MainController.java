package com.repo.controller;

import com.repo.model.request.AuthorModelRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class MainController {

    @PostMapping("/author/save")
    public ResponseEntity getAuthorByEmail(@RequestBody @Valid AuthorModelRequest author){
        return ResponseEntity.ok(author);
    }
}
