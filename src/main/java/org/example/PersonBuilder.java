package org.example;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (this.age >= 0 && this.age <= 105) {
            if (this.name != null && this.surname != null) {
                return new Person(this.name, this.surname, this.address, this.age);
            } else {
                throw new IllegalStateException("The data is not enough");
            }
        } else {
            throw new IllegalArgumentException("The age is incorrect");
        }
    }
}

