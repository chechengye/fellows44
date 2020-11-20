package day11.iterator;

import java.util.Arrays;

public class ConcreteAggregate implements Aggregate {

    private Object[] list = null;
    private int index;
    public ConcreteAggregate(){
        list = new Object[50];
    }

    @Override
    public void add(Object o) {
        if(index==list.length)
            list = Arrays.copyOf(list , list.length + list.length / 2);
        list[index++] = o;
    }

    @Override
    public int size() {
        return index;
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public Object get(int index) {
        if(index < 0 || index >= this.index)
            throw new IllegalArgumentException("数组下标越界");
        return list[index];
    }
}
