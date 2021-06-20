package one.suzamax.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.suzamax.demo.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Tutto è buio
}
