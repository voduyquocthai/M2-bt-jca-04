package Entities;

public class Student {
    private String name;
    private int id;
    private String dateOfBirth;
    private String _class;

    public Student(String name, int id, String dateOfBirth, String _class) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this._class = _class;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", _class='" + _class + '\'' +
                '}';
    }
}
