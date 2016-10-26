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
            if (var) {
                animal_mass[i].kind = "травоядное";
                String[] herbal_mass = {"Слон", "Жираф", "Антилопа", "Зебра", "Заяц"};
                animal_mass[i].name = herbal_mass[gen.nextInt(5)];
            } else {
                animal_mass[i].kind = "хищное";
                String[] predator_mass = {"Тигр", "Волк", "Лев", "Крокодил"};
                animal_mass[i].name = predator_mass[gen.nextInt(4)];
            }
            String[] col_arr = {"черный", "белый", "коричневый", "серый", "рыжий"};
            String[] gender_arr = {"самка", "самец"};
            animal_mass[i].color = col_arr[gen.nextInt(5)];
            animal_mass[i].gender = gender_arr[gen.nextInt(2)];
            System.out.println((i + 1) + " сбежавший представитель зоопарка это " + animal_mass[i].kind + " животное " + animal_mass[i].name);
            System.out.println(animal_mass[i].name + " имеет " + animal_mass[i].color + " окрас, а также " + animal_mass[i].name + " - " + animal_mass[i].gender);
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

