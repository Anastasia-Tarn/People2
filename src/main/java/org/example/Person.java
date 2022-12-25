package org.example;


import java.util.Optional;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected String address;
    protected int age;

    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    Person(String name, String surname, String address, int age) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.age = age;
    }

    public boolean hasAge() {
        return this.age != 0;
    }

    public boolean hasAddress() {
        return this.address != null;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(this.age);
    }

    public Optional<String> getAddress() {
        return Optional.of(this.address);
    }

    public void happyBirthday() {
        ++this.age;
    }

    public String toString() {
        return this.name + " " + this.surname + ". Возраст " + this.age + ". Адрес: " + this.address + " ";
    }

    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode();
    }

    public PersonBuilder newChildBuilder() {
        return (new PersonBuilder()).setSurname(this.surname).setAddress(this.address);
    }
}

