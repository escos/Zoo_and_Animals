package ru.levelp.myzoo;

public class Main {
    public static void main(String[] args) {
        System.out.println("В ЗООПАРКЕ СЛУЧИЛОСЬ ЧРЕЗВЫЧАЙНОЕ ПРОИСШЕСТВИЕ, СБЕЖАЛИ ЗВЕРИ!");
        System.out.println();
        Animal[] array = Zoo.createZoo();
        System.out.println();
        System.out.println("ВЫЯСНИЛОСЬ ВСКОРЕ СЛЕДУЮЩЕЕ:");
        System.out.println();
        Zoo.separateHerbivore(array);
        System.out.println();
        System.out.println("В ОДНУ СТОРОНУ УБЕЖАЛИ ДВОЕ ЖИВОТНЫХ!");
        System.out.println();
        Zoo.animalEating(array);
    }
}