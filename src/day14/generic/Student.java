package day14.generic;

import com.sun.scenario.effect.impl.prism.PrImage;

public class Student<T> {
    private T core;

    public Student(T core) {
        this.core = core;
    }
    public Student() {
    }

    public T getCore() {
        return core;
    }

    public void setCore(T core) {
        this.core = core;
    }


}
