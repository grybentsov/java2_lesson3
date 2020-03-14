package ru.geekbrains.part_2_lesson_3;

import java.util.*;

import static ru.geekbrains.part_2_lesson_3.Person.phone;

public class PhoneBook {

    private Person person;
    private HashMap<Person, ArrayList<String>> phoneBook = new HashMap<>();

    public void addPerson(Person person) {
        ArrayList<String> phoneList = phoneBook.get(person);
        phoneList = new ArrayList<>();
        phoneList.add(person.phone);
        phoneBook.put(person, phoneList);
    }

    public ArrayList<String> getInfo(String name) {
        return phoneBook.get(phoneBook.get(person));
    }

    private HashMap<String, String> emailBook = new HashMap<>();
    public void addEmail(String name, String email) {
        emailBook.put(name, email);
    }

    public String getEmail(String name) {
        return emailBook.get(name);
    }
}
