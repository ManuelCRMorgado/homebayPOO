package pt.iade.homebay.controllers;


import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javassist.NotFoundException;
import pt.iade.homebay.models.Casa;
import pt.iade.homebay.models.repositories.CasaRepository;

@RestController
@RequestMapping(path="/api/casas")
public class CasaController {
    private Logger logger = LoggerFactory.getLogger(CasaController.class);
    @Autowired
    private CasaRepository casaRepository;

    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Casa> getCasas() {
        logger.info(casaRepository.findAll().toString());
        return casaRepository.findAll();
    }

    @GetMapping(path = "{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Casa getCasas(@PathVariable int id) throws NotFoundException {
        Optional<Casa> casa = casaRepository.findById(id);
        if(casa.isEmpty()) throw new NotFoundException("Id " + id + "not found");
        else return casa.get();
    }

    @PutMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public Casa updateCasa(@RequestBody Casa casa) {
        Casa original = casaRepository.findById(casa.getId()).get();
        casa.setAdminId(original.getAdminId());
        casa.setAgenteId(original.getAgenteId());
        casaRepository.save(casa);
        return casa;
    }
}
