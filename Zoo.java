package ru.levelp.myzoo;

import java.util.Scanner;
import java.util.Random;

public class Zoo {
    static Scanner sc = new Scanner(System.in);
    static Random gen = new Random();

    public static Animal[] createZoo() {
        int N = 6;
        Animal[] animal_mass = new Animal[N];
        for (int i = 0; i < N; i++) {
            boolean var = gen.nextBoolean();
            String kind;
            String name;
            if (var) {
                kind = "травоядное";
                String[] men_mass = {"Слон", "Жираф", "Антилопа", "Зебра", "Заяц"};
                name = men_mass[gen.nextInt(5)];
            } else {
                kind = "хищное";
                String[] women_mass = {"Тигр", "Волк", "Лев", "Крокодил"};
                name = women_mass[gen.nextInt(5)];
            }
            String[] col_arr = {"черный", "белый", "коричневый", "серый", "рыжий"};
            String[] gender_arr = {"самка", "самец"};
            String color = col_arr[gen.nextInt(5)];
            String gender = gender_arr[gen.nextInt(2)];
            System.out.println((i + 1) + " сбежавший представитель зоопарка это " + kind + " животное " + name);
            System.out.println(name + " имеет " + color + " окрас, а также "+name+" - " + gender);
        }
        return animal_mass;
    }

    public static Animal paring(Animal arr1, Animal arr2) {
        boolean kind = arr1.kind;
        String name = arr1.name;
        Animal child = new Animal(name, kind);

        if (arr1.color == arr2.color) {
            child.color = arr1.color;
        } else {
            if (arr1.gender == "самка") {
                child.color = arr1.color;
            } else {
                child.color = arr2.color;
            }
        }
        System.out.println("В результате спаривания может получится " + name + " " + child.color + " цвета");
        return child;
    }
}

