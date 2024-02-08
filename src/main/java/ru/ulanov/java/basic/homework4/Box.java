package ru.ulanov.java.basic.homework4;

public class Box {
    private int size;
    private String colour;
    private String object;

    public Box(int size, String colour) {
        this.size = size;
        this.colour = colour;
    }
    public int getSize() {
        return size;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public void info() {
        System.out.println("Коробка " + getColour() + " " + getSize());
    }
    public void open() {
        System.out.println("Коробка открыта");
    }
    public void close() {
        System.out.println("Коробка закрыта");
    }
    public void putObject(String object) {
       System.out.println(object + " положили в коробку");
    }
    public void pickUpObject(String object) {
        System.out.println( "Достали " + object + " из коробки");
    }
}
