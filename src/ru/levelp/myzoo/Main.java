package ru.levelp.myzoo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Animal[] array = Zoo.createZoo();
        Zoo.herbivoreSort(array);
    }
}