package UmbertoAmoroso.u5d8.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "blogposts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Blogpost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private double readingTime;

    @ManyToOne
    @JoinColumn(name = "authorId")
    private Author author;
}
