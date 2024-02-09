package ru.ulanov.java.basic.homework4;

public class Box {
    private int size;
    private String colour;
    private String object;
    private Boolean status; {
        this.status = true;
    }

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
        System.out.println("Открыли коробку");
        status = false;
    }
    public void close() {
        System.out.println("Закрыли коробку");
        status = true;
    }

    public void putObject(String object) {
        if (status = true) {
            System.out.println(object + " положили в коробку");
        } else {
            System.out.println("Коробка закрыта, сначало её нужно открыть");
        }
        int thing [] = new int[size];
        int sum = 0;
        for (int i = 0; i <= thing.length; i++) {

            if (i > size) {
                System.out.println("Коробка уже полная");
                break;
            }

        }
    }
    public void pickUpObject(String object) {
        if (status = false) {
            System.out.println("Достали " + object + " из коробки");
        } else {
            System.out.println("Коробка закрыта, сначало её нужно открыть");
        }
    }

}
