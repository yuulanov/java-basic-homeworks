package ru.ulanov.java.basic.homework4;

public class User {
    private String surname;
    private String name;
    private String middleName;
    private int yearOfBirth;
    private String email;

    public User(String surname, String name, String middleName, int yearOfBirth, String email) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
    }
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getMiddleName() {
        return middleName;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail() {
        this.email = email;
    }
    public void info() {
        System.out.println("ФИО: " + surname + " " + name + " " + middleName + " " + yearOfBirth + " " + email);
    }

}
