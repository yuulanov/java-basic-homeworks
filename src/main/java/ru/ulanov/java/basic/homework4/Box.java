package ru.ulanov.java.basic.homework4;

public class Box {
    private final String[] size;
    private String colour;
    private String object;
    private Boolean status; {
        this.status = true;
    }

    public Box(int size, String colour) {
        this.size = new String[3];
        this.colour = colour;
    }
    public String[] getSize() {
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
        status = true;
    }

    public void close() {
        System.out.println("Закрыли коробку");
        status = false;
    }

    public void putObject(String object) {
        if (status) {
            for (int i = 0; i < size.length; i++) {
                if (size[i] == null) {
                    size[i] = object;
                    System.out.println("В коробке есть место, положили " + object + "в коробку. В коробке: " + object);
                    return;

                }


            }


        } else

    {
        System.out.println("Коробка закрыта, прежде чем класть в нее предметы, сначала её нужно открыть");
    }

}

    public void pickUpObject(String object) {
        if (status) {
            System.out.println("Достали " + object + " из коробки");
        } else {
            System.out.println("Коробка закрыта. Прежде чем вынимать предмет, сначал её нужно открыть");
        }
    }

}
