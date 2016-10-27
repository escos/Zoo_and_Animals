package ru.levelp.myzoo;

import java.util.ArrayList;
import java.util.Random;

public class Zoo {
    static Random gen = new Random();
    final static int N = 5;
    // Создаем зоопарк из N животных
    public static Animal[] createZoo() {
        Animal[] animal_mass = new Animal[N];
        for (int i = 0; i < N; i++) {
            String[] col_arr = {"черный", "белый", "коричневый", "серый", "рыжий"};
            String[] gender_arr = {"самка", "самец"};
            String color = col_arr[gen.nextInt(5)];
            String gender = gender_arr[gen.nextInt(2)];
            String name;
            String kind;
            boolean var = gen.nextBoolean();
            if (var) {
                kind = "травоядное";
                String[] herbal_mass = {"Слон", "Жираф", "Антилопа", "Зебра", "Заяц"};
                name = herbal_mass[gen.nextInt(5)];
            } else {
                kind = "хищное";
                String[] predator_mass = {"Тигр", "Волк", "Лев", "Крокодил"};
                name = predator_mass[gen.nextInt(4)];
            }
            animal_mass[i] = new Animal(name, color, kind, gender);
            System.out.println((i + 1) + " сбежавший представитель зоопарка - это " + animal_mass[i].kind + " животное - " + animal_mass[i].name+".");
            System.out.println(animal_mass[i].name + " имеет " + animal_mass[i].color + " окрас, а также " + animal_mass[i].name + " - " + animal_mass[i].gender+".");
        }
        return animal_mass;
    }
    // Отсортировываем и считаем количество тарвоядных
    public static void herbivoreSort (Animal arr[]) {
        ArrayList<String> herbalName = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].kind == "травоядное") {
                count += 1;
                herbalName.add(arr[i].name);
            }
        }
        System.out.println("Количество сбежавших травоядных животных = " + count);
        System.out.println("Сбежавшее(ие) травоядное(ые): "+ herbalName);
    }
    // Два животных едят
    public static void animalEating(Animal arr[]) {
        Animal A1 = arr[gen.nextInt(N-2)];
        Animal A2 = arr[N-1];
        if (A1.kind != A2.kind) {
            System.out.println("Так как в одну сторону побежали и хищник и травоядное животное, ");

            if (A1.kind == "травоядное") {
                System.out.println("то зверь под названием " + A2.name + " съел(а) бедного животного под названием " + A1.name);
            } else {
                System.out.println("то зверь под названием " + A1.name + " сожрал бедного животного под названием " + A2.name);
            }
        } else {
            if (A1.kind == "хищное") {
                System.out.println("Так как в одну сторону побежали два хищника: " + A1.name + " и " + A2.name);
                System.out.println("то они побежали вдвоем в поисках живой еды!");
            } else {
                System.out.println("Так как в одну сторону побежали два травоядных: " + A1.name + " и " + A2.name);
                System.out.println("то они быстро нашли еду растительного происхождения");
            }
        }
    }
}

