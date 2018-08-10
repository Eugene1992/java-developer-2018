package relations.many_to_many;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "books", cascade = CascadeType.ALL)
    private List<Author> authors;

    public Book(String name, List<Author> authors) {
        this.name = name;
        this.authors = authors;
    }

    public Book(String name) {
        this.name = name;
    }
}
