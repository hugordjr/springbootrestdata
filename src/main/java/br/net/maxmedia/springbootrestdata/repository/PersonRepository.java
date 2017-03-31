package br.net.maxmedia.springbootrestdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.net.maxmedia.springbootrestdata.model.Person;

@RepositoryRestResource
public interface PersonRepository extends CrudRepository<Person, Long> {

}
