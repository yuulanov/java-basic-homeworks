package ru.ulanov.java.basic.homework4;

public class Main {

    public static void main(String[] args) {

        User[] users = {
                new User("Ivanov", "Ivan", "Ivanovich", 1956, "1@mail"),
                new User("Petrov", "Ivan", "Ivanovich", 1976, "1@mail"),
                new User("Sidorov", "Ivan", "Ivanovich", 1946, "1@mail"),
                new User("Kochkin", "Ivan", "Ivanovich", 1986, "1@mail"),
                new User("Lochkin", "Ivan", "Ivanovich", 1966, "1@mail"),
                new User("Sirov", "Ivan", "Ivanovich", 1936, "1@mail"),
                new User("Durov", "Ivan", "Ivanovich", 1956, "1@mail"),
                new User("Konev", "Ivan", "Ivanovich", 1946, "1@mail"),
                new User("Zaycev", "Ivan", "Ivanovich", 1986, "1@mail"),
                new User("Morev", "Ivan", "Ivanovich", 1996, "1@mail"),
        };
        //for (int i = 0; i < users.length; i++) {
        //if ([i][3] > 1983) {
        //users[i].info();

        //}

        Box box1 = new Box(20, "Зеленая");
        box1.info();
        box1.setColour("Красная");
        box1.info();
        box1.open();
        box1.putObject("Планшет");
        box1.close();
        box1.open();
        box1.pickUpObject("планшет");

    }

}
