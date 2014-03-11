package pv168.addressBook;

import java.util.List;

/**
 * Created by Marek on 5.3.2014.
 */
public interface RecordManager {

    Record createRecord(Record record);

    void deleteRecord(Record record);

    List<Record> findAllRecords();

    void updateRecord(Record record);
}
