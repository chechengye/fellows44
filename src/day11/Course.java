package day11;

public class Course {
    private int id;
    private String cname;

    public Course() {
    }

    public Course(int id, String cname) {
        this.id = id;
        this.cname = cname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                '}';
    }
}
