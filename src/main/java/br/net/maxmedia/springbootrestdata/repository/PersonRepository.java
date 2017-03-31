package br.net.maxmedia.springbootrestdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.net.maxmedia.springbootrestdata.model.Person;

@RepositoryRestResource(collectionResourceRel = "persons", path = "persons")
public interface PersonRepository extends JpaRepository<Person, Long> {
	List<Person> findByLastName(@Param("firstName") String firstName);

	Person findByFirstNameAndLastName(String firstName, String lastName);
}
