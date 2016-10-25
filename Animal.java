package ru.levelp.myzoo;

public class Animal {
    String name; // название животного
    String color; // цвет животного
    boolean kind; // хищник или травоядное
    String gender; // самка или самец

    Animal(String name, boolean kind) {
        this.name = name;
        this.kind = kind;
    }

    public static void animalWolking() {
        System.out.println("Звери бегают по зоопарку, ищут выход");
        System.out.println("Но вскоре проголодаются и захотят есть!");
    }

    public static void animalEating(Animal A1, Animal A2) {
        if (A1.kind != A2.kind) {
            System.out.println("Так как в одну сторону побежали и хищник и травоядное животное, ");

            if (A1.kind) {
                System.out.println("то зверь под названием " + A2.name + " съел(а) бедного животного под названием " + A1.name);
            } else {
                System.out.println("то зверь под названием " + A2.name + " сожрал бедного животного под названием " + A1.name);
            }
        } else {
            if (A1.kind == false) {
                System.out.println("Так как в одну сторону побежали два хищника: " + A1.name + " и " + A2.name);
                System.out.println("то они побежали вдвоем в поисках живой еды!");
            } else {
                System.out.println("Так как в одну сторону побежали два травоядных: " + A1.name + " и " + A2.name);
                System.out.println("то они быстро нашли еду растительного происхождения");
            }
        }
    }


}


