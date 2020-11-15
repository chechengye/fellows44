package day09.pigDemo;

public class Pig {
    private String name;
    private int month;
    private int id;



    public Pig(String name, int month , int id) {
        this.name = name;
        this.month = month;
        this.id = id;
    }

    public Pig() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", month=" + month +
                '}';
    }
}
