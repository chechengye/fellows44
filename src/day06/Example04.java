package day06;

/**
 * Object类讲解
 * finalize() :GC机制调用，回收不使用的对象
 * final :  最终，常量的一种概念
 * finally{} 异常相关 try{}catch(){}finally{} : 最终一定被执行的代码块
 */
public class Example04 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;
        System.out.println(n1 == n2);
        String s1 = "10";
        String s2 = "11";
        System.out.println(s1.equals(s2));
        Student stu1 = new Student("zhangsan",18);
        Student stu2 = new Student("zhangsan",18);
        System.out.println(stu1.equals(stu2));
        System.out.println("--------------------");
        System.out.println(stu1);
        /*System.out.println(stu1.getClass());
        System.out.println("------------------");
        System.out.println(Student.class);
        System.out.println("------------------");
        /*try {
            Class.forName("day06.Student" , false , ClassLoader.getSystemClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/
    }
}
class Student{
    private String name;
    private int age;

    static {
        System.out.println("静态代码块!!!");
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof Student){
            Student stu = (Student)obj;
            if(!this.name.equals(stu.getName()))
                return false;
            if(this.age != stu.getAge())
                return false;
            else return true;
        }
        return false;
    }
}