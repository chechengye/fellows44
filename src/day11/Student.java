package day11;

public class Student {

    private int id;
    private String name;
    private int sno;

    public Student() {
    }

    public Student(int id, String name, int sno) {
        this.id = id;
        this.name = name;
        this.sno = sno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sno=" + sno +
                '}';
    }
}
