package UmbertoAmoroso.u5d8.repositories;

import UmbertoAmoroso.u5d8.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorsRepository extends JpaRepository<Author, Integer> {
    Optional<Author> findByEmail(String email);
}
