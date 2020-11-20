package day11;

import java.util.List;

public class Teacher {

    private int id;
    private String name;
    private int age;
    private List<Student> studentList;

    public Teacher() {
    }

    public Teacher(int id, String name, int age, List<Student> studentList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.studentList = studentList;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", studentList=" + studentList +
                '}';
    }
}
