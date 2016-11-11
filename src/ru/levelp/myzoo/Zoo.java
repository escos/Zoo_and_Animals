package ru.levelp.myzoo;

import java.util.ArrayList;
import java.util.Random;

public class Zoo {
    static Random gen = new Random();
    final static int N = 5;

    public enum Animalkinds {
        HERBIVORE {
            public String toString() {
                return "травоядное";
            }
        },
        PREDATOR {
            public String toString() {
                return "хищное";
            }
        }
    }
    // Создаем зоопарк из N животных
    public static Animal[] createZoo() {
        Animal[] animalArray = new Animal[N];
        for (int i = 0; i < N; i++) {
            String[] colArray = {"черный", "белый", "коричневый", "серый", "рыжий"};
            String[] gendersArray = {"самка", "самец"};
            String color = colArray[gen.nextInt(colArray.length)];
            String gender = gendersArray[gen.nextInt(gendersArray.length)];
            String name;
            String kind;
            boolean var = gen.nextBoolean();
            if (var) {
                kind = String.valueOf(Animalkinds.HERBIVORE);
                String[] herbalsArray = {"Слон", "Жираф", "Антилопа", "Зебра", "Заяц"};
                name = herbalsArray[gen.nextInt(herbalsArray.length)];
            } else {
                kind = String.valueOf(Animalkinds.PREDATOR);
                String[] predatorsArray = {"Тигр", "Волк", "Лев", "Крокодил"};
                name = predatorsArray[gen.nextInt(predatorsArray.length)];
            }
            animalArray[i] = new Animal(name, color, kind, gender);
            System.out.printf("%d-й сбежавший представитель зоопарка - это %s животное - %s.\n", (i + 1), animalArray[i].kind, animalArray[i].name);
            System.out.printf("  %s имеет %s окрас, а также %s - %s.\n", animalArray[i].name, animalArray[i].color, animalArray[i].name, animalArray[i].gender);
        }
        return animalArray;
    }

    // Отсортировываем и считаем количество тарвоядных
    public static void separateHerbivore(Animal[] arr) {
        ArrayList<String> herbivoreName = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].kind.equals(String.valueOf(Animalkinds.HERBIVORE))) {
                herbivoreName.add(arr[i].name);
            }
        }
        System.out.println("Количество сбежавших травоядных животных = " + herbivoreName.size());
        System.out.println("Сбежавшее(ие) травоядное(ые): " + herbivoreName);
    }

    // Два животных едят
    public static void animalEating(Animal[] arr) {
        Animal A1 = arr[gen.nextInt(N - 2)];
        Animal A2 = arr[N - 1];
        if (!A1.kind.equals(A2.kind)) {
            System.out.println("Так как в одну сторону побежали и хищник и травоядное животное, ");

            if (A1.kind.equals(String.valueOf(Animalkinds.HERBIVORE))) {
                System.out.printf("то зверь под названием %s съел бедного животного под названием %s.\n", A2.name, A1.name);
            } else {
                System.out.printf("то зверь под названием %s съел бедного животного под названием %s.\n", A1.name, A2.name);
            }
        } else {
            if (A1.kind.equals(String.valueOf(Animalkinds.PREDATOR))) {
                System.out.printf("Так как в одну сторону побежали два хищника: %s и %s,\n", A1.name, A2.name);
                System.out.println("то они побежали вдвоем в поисках живой еды!");
            } else {
                System.out.printf("Так как в одну сторону побежали два травоядных: %s и %s,\n", A1.name, A2.name);
                System.out.println("то они быстро нашли еду растительного происхождения.");
            }
        }
    }
}

