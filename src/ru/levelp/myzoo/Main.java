package ru.levelp.myzoo;

public class Main {

    public static void main(String[] args) {
        Animal[] array = Zoo.createZoo();
        Zoo.herbivoreSort(array);
    }
}