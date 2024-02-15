package ru.ulanov.java.basic.homework6;

public class Cat {
    private String name;
    private int appetite;
   public Boolean satiety = false;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void info() {
        System.out.println("У кота " + name + " аппетит " + appetite + " и насыщенность " + satiety);
    }

    public void toEat(int eats) {

        appetite -= eats;
        if (appetite <= 0) {
            satiety = true;
            System.out.println("Кот поел досыта");
        } else {
            satiety = false;
            System.out.println("Кот поел но еще голоден");
        }

    }

}
