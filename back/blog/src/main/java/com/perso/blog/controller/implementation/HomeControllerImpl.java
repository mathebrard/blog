package com.perso.blog.controller.implementation;

import com.perso.blog.controller.declaration.HomeControllerDeclaration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeControllerImpl implements HomeControllerDeclaration {

    @Override
    public ResponseEntity<String> getHomeInformations() {
        return ResponseEntity.ok("dd");
    }
}
