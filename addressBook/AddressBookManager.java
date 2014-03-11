package pv168.addressBook;

/**
 * Created by Marek on 5.3.2014.
 */
public interface AddressBookManager {

    Record findPerson(Person person);

    void attachRecord(Person person, Record record);

    void removeRecord(Record record);
}
