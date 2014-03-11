package pv168.addressBook;

/**
 * Created by Marek on 5.3.2014.
 */
public class Record {

    private int id;
    private TypeEnum type;
    private String value;

    public Record(int id, TypeEnum type, String value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }

    public Record() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Record record = (Record) o;

        if (id != record.id) return false;
        if (type != record.type) return false;
        if (value != null ? !value.equals(record.value) : record.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", type=" + type +
                ", value='" + value + '\'' +
                '}';
    }
}
