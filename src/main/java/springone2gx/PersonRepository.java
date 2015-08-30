package springone2gx;

import java.util.List;

public interface PersonRepository {

    Person findById(Long id);
    List<Person> findAllByLastName(String lastName);
}
