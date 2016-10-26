package ru.levelp.myzoo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class Zoo {
    static Scanner sc = new Scanner(System.in);
    static Random gen = new Random();
    final private static int N = 5;

    public static Animal[] createZoo() {
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
                name = women_mass[gen.nextInt(4)];
            }
            String[] col_arr = {"черный", "белый", "коричневый", "серый", "рыжий"};
            String[] gender_arr = {"самка", "самец"};
            String color = col_arr[gen.nextInt(5)];
            String gender = gender_arr[gen.nextInt(2)];
            System.out.println((i + 1) + " сбежавший представитель зоопарка это " + kind + " животное " + name);
            System.out.println(name + " имеет " + color + " окрас, а также " + name + " - " + gender);
        }
        return animal_mass;
    }

    public static void herbivoreSort(Animal arr[]) {
        ArrayList<String> herbiNames = new ArrayList<String>();
        int count = 0;
        int i;
        for (i = 0; i < arr.length; i++)
            if (arr[i].kind) {
                count += 1;
                herbiNames.add(arr[i].name);
            }
        System.out.println("Количество сбежавших травоядных: " + count);
        System.out.println("Список сбежавших травоядных:" + herbiNames);
    }
}

