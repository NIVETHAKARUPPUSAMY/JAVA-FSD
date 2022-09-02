package Authentication.repositories;

import org.springframework.data.repository.CrudRepository;

import Authentication.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByName(String name);
}