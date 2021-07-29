package pt.iade.homebay.models.repositories;

import org.springframework.data.repository.CrudRepository;

import pt.iade.homebay.models.Casa;

public interface CasaRepository extends CrudRepository<Casa, Integer> {
    
}
