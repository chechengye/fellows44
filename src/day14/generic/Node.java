package day14.generic;

/**
 * 泛型的类型
 * 通常使用 T , E , V , K
 * @param <T>
 */
public class Node<T> {

    private T data;
    private int age;

    public Node(T data){
        this.data = data;
    }

    public Node(T data, int age) {
        this.data = data;
        this.age = age;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
