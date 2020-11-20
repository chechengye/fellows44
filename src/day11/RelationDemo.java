package day11;

import java.util.ArrayList;
import java.util.List;

/**
 * 1对多与多对多
 */
public class RelationDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"小红",200102));
        studentList.add(new Student(2,"小黑",200103));
        Teacher t1 = new Teacher(1 , "张三",33,studentList);
        System.out.println(t1);
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1 , "语文课"));
        courseList.add(new Course(2 , "英语课"));
        List<StudentCourse> scList = new ArrayList<>();
        scList.add(new StudentCourse(1 , 1));
        scList.add(new StudentCourse(1 , 2));
        for(StudentCourse sc : scList){
            if(1 == sc.getSid()){//需求：取得第一个学生的选修的所有课程
                for(Course c : courseList){
                    if(sc.getCid() == c.getId()){
                        System.out.println(c.getCname());
                    }
                }
            }
        }
    }
}
