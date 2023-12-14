package Pr_18;

import java.io.Serializable;

class MyClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T t;
    private V v;
    private K k;

    public MyClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void printClassNames() {
        System.out.println("Тип T: " + t.getClass().getSimpleName());
        System.out.println("Тип V: " + v.getClass().getSimpleName());
        System.out.println("Тип K: " + k.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        MyClass<Integer, Animal, String> threeParams = new MyClass<>(77, new Animal("Felix", 4), "Hello");

        Integer t = threeParams.getT();
        Animal v = threeParams.getV();
        String k = threeParams.getK();

        System.out.println("Первый параметр: " + t);
        System.out.println("Второй параметр: " + v);
        System.out.println("Третий параметр: " + k);
        System.out.println();
        threeParams.printClassNames();

    }
}
