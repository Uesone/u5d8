package UmbertoAmoroso.u5d8.repositories;

import UmbertoAmoroso.u5d8.entities.Author;
import UmbertoAmoroso.u5d8.entities.Blogpost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogsRepository extends JpaRepository<Blogpost, Integer> {
    List<Blogpost> findByAuthor(Author author);
}
