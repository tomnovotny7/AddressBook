package pv168.addressBook;

import java.util.List;

/**
 * Created by Marek on 5.3.2014.
 */
public interface PersonManager {

    public Person createPerson(Person person);

    public void deletePerson(Person person);

    public List<Person> findAllPersons();

    public void updatePerson(Person person);

}
