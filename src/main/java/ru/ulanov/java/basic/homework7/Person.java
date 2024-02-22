package ru.ulanov.java.basic.homework7;

public class Person {
    String name;
    String currentTransport;

    public Person(String name, String currentTransport) {
        this.name = name;
        this.currentTransport = currentTransport;
    }
    public String getName() {
        return name;
    }
    public String getCurrentTransport() {
        return currentTransport;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCurrentTransport(String currentTransport) {
        this.currentTransport = currentTransport;
    }
}
