package ru.levelp.myzoo;

import java.util.ArrayList;
import java.util.Random;

public class Zoo {
    static Random gen = new Random();
    final static int N = 5;

    public static Animal[] createZoo() {

        Animal[] animal_mass = new Animal[N];
        for (int i = 0; i < N; i++) {
            boolean var = gen.nextBoolean();
            String kind = animal_mass[i].kind;
            String name = animal_mass[i].name;
            String color = animal_mass[i].color;
            String gender = animal_mass[i].gender;
            if (var) {
                animal_mass[i].kind = "травоядное";
                String[] men_mass = {"Слон", "Жираф", "Антилопа", "Зебра", "Заяц"};
                animal_mass[i].name = men_mass[gen.nextInt(5)];
            } else {
                animal_mass[i].kind = "хищное";
                String[] women_mass = {"Тигр", "Волк", "Лев", "Крокодил"};
                animal_mass[i].name = women_mass[gen.nextInt(4)];
            }
            String[] col_arr = {"черный", "белый", "коричневый", "серый", "рыжий"};
            String[] gender_arr = {"самка", "самец"};
            animal_mass[i].color = col_arr[gen.nextInt(5)];
            animal_mass[i].gender = gender_arr[gen.nextInt(2)];
            System.out.println((i + 1) + " сбежавший представитель зоопарка это " + kind + " животное " + name);
            System.out.println(name + " имеет " + color + " окрас, а также " + name + " - " + gender);
        }
        return animal_mass;
    }

    public static void herbivoreSort (Animal arr[]) {
        ArrayList<String> herbalName = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].kind == "травоядное") {
                count += 1;
                herbalName.add(arr[i].name);
            }
        }
        System.out.println("Количество сбежавших тарвоядных животных = " + count);
        System.out.println("Сбежавшие животные: "+ herbalName);
    }
}

