package org.example;

class Box<T>{
    private T value;
    public void set(T value){this.value=value;}
    public T get(){return value;}
}

public class Generics{
    public static void main(String[] args) {
        Box<String> stringBox=new Box<>();
        stringBox.set("Hello Hi Bye Bye");
        System.out.println(stringBox.get());

        Box<Integer> integerBox=new Box<>();
        integerBox.set(45);
        System.out.println(integerBox.get());

    }

}