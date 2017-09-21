package repository;

import entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Jesus on 21.09.2017.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByFirstName(String name);
}
