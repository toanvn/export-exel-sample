package clc.tool.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by qup on 11/22/16.
 */
@Repository
@RepositoryRestResource(path = "customer")
public interface CustomerRepository extends MongoRepository<Customer, String>{
    @RestResource(path = "firstName")
    public Customer findByFirstName(@Param("name")String firstName);
    @RestResource(path = "lastName")
    public List<Customer> findByLastName(String lastName);
}
