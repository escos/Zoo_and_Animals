package ru.levelp.myzoo;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Animal[] array = Zoo.createZoo();
        System.out.printf("Выберите двух представителей зоопарка, побежавших в одну сторону(необходимо ввести 2 числа типа int в промежутке от 1 до N)");
        int first = sc.nextInt();
        int second = sc.nextInt();

        System.out.println("В одну сторону побежали следующие звери: " + array[first].name + " и " + array[second].name);
        if (array[first].kind == array[second].kind) {
            System.out.println("Сбежавшие животные могут спариваться");
            Zoo.paring(array[first], array[second]);
        }
        Animal.animalWolking();
        Animal.animalEating(array[first], array[second]);
    }
}