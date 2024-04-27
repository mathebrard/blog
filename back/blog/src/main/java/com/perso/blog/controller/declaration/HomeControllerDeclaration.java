package com.perso.blog.controller.declaration;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface HomeControllerDeclaration {

    @GetMapping
    ResponseEntity<String> getHomeInformations();

}
