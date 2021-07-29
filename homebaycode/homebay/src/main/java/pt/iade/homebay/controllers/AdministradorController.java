package pt.iade.homebay.controllers;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.iade.homebay.models.Administrador;
import pt.iade.homebay.models.repositories.AdministradorRepository;

@RestController
@RequestMapping(path="/api/administradores")
public class AdministradorController {
    private Logger logger = LoggerFactory.getLogger(AdministradorController.class);
    @Autowired
    private AdministradorRepository administradorRepository;

    @PostMapping(path = "/login", produces= MediaType.APPLICATION_JSON_VALUE)
    public boolean login(@RequestBody LoginRequest request) {
        Iterable<Administrador> admins = administradorRepository.findAll();
        for(Administrador admin : admins) {
            if(admin.getNome().equals(request.username)) {
                return true; 
            }
        }
        return false;
    }
}
