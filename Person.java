package ru.geekbrains.part_2_lesson_3;

public class Person {
    public static String name;
    public static String phone;
    Person(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
    static String getName(){
        return name;
    }

}
