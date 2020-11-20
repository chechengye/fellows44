package day11.iterator;

public interface Aggregate {
    //添加
    void add(Object o);
    //大小
    int size();
    //获取迭代器
    Iterator iterator();
    //获取元素的方法
    Object get(int index);
}
