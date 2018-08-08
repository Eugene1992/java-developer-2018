package mapping.one_to_many;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "department_one_to_one")
public class Department {

    @Id
    private int id;

    private String name;
}
