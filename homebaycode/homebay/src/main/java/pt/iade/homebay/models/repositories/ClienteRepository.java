package pt.iade.homebay.models.repositories;

import pt.iade.homebay.models.Cliente;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Integer>{
    
}
