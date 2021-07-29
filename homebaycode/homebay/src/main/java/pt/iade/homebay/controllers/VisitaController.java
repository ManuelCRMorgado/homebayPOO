package pt.iade.homebay.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Console;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import pt.iade.homebay.models.Casa;
import pt.iade.homebay.models.Cliente;
import pt.iade.homebay.models.Visita;
import pt.iade.homebay.models.VisitaCliente;
import pt.iade.homebay.models.repositories.CasaRepository;
import pt.iade.homebay.models.repositories.ClienteRepository;
import pt.iade.homebay.models.repositories.VisitaRepository;

@RestController
@RequestMapping(path="/api/visitas")
public class VisitaController {
    
    private Logger logger = LoggerFactory.getLogger(VisitaController.class);
    @Autowired
    private VisitaRepository visitaRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private CasaRepository casaRepository;

    @PostMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public boolean saveVisita(@RequestBody RequestWrapper rw) {
        logger.info("Saving Visita on: " + rw.visita.getData());
        logger.info("Saving Cliente called: " + rw.cliente.getNome());
        Cliente cliente = clienteRepository.save(rw.cliente);
        rw.visita.setcId(cliente.getId());

        Iterable<Visita> visitas = visitaRepository.findAll();
        for(Visita v : visitas) {
            if(rw.visita.getData().equals(v.getData()) && rw.visita.getHora() == v.getHora()) {
                return false;
            }
        }

        Visita Visita = visitaRepository.save(rw.visita);
        return true;
    }

    @GetMapping(path="",  produces= MediaType.APPLICATION_JSON_VALUE)
    public Iterable<VisitaCliente> getVisitas() {
        Iterable<Visita> visitas = visitaRepository.findAll();
        ArrayList<VisitaCliente> vcs = new ArrayList<VisitaCliente>(); 
        for(Visita visita : visitas) {
            Cliente cliente = clienteRepository.findById(visita.getcId()).get();
            Casa casa = casaRepository.findById(visita.getImId()).get();
            vcs.add(new VisitaCliente(casa.getNome(), visita.getData(), visita.getHora(), cliente.getNome()));
        }
        return vcs;
    }
}
