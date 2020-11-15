package day09;

/**
 * 事先预设好排序规则
 */
public class Bird /*implements Comparable<Bird>*/{
    private String name;
    private int month;

    public Bird() {
    }

    public Bird(String name, int month) {
        this.name = name;
        this.month = month;
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

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", month=" + month +
                '}';
    }

    /*@Override
    public int compareTo(Bird b) {
      *//*  int m = this.month - b.getMonth();
        if(m < 0) return -1;
        else if(m > 0) return 1;*//*

        return this.month - b.getMonth();
    }*/
}
