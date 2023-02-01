package com.chaojun.basic.javautil;

import java.util.ArrayList;
import java.util.Objects;

public class JavaList {
    public static void main(String[] args) {
        //List集合调用remove删除对象，  会调用对象的equals方法，  如果对象的equals方法始终return true， 将会删除第一个对象
        Person cj1 = new Person(1, "cj1", 21);
        Person cj2 = new Person(2, "cj2", 21);
        Person cj3 = new Person(3, "cj3", 21);
        Person cj4 = new Person(4, "cj4", 21);
        ArrayList<Person> list = new ArrayList<>();
        list.add(cj1);
        list.add(cj2);
        list.add(cj3);
        list.add(cj4);
        System.out.println(list);
        list.remove(cj2);
        System.out.println(list);
    }
}

class Person{
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}