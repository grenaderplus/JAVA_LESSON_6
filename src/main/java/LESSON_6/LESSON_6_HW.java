package LESSON_6;

import ANIMALS.*; // импорт параметров из другого класса/пакета; * - импорт всех классов пакета

import java.util.Scanner;

public class LESSON_6_HW {
    public static void main(String[] args) {
//        Cat cat = new Cat("Barsik", "red", 3);
//        Dog dog = new Dog("Vulkan", "white", 7);
//        Cow cow = new Cow("Burenka", "brown", 5);
//        Duck duck = new Duck("Klava", "black", 1);
//        WildCat wildCat = new WildCat("Bor", "grey", 3, 10, 1);

//        Animal cat = new Cat("Barsik", "red", 3); // можно объявить объект через родительский класс, но по умолчанию будут доступны только методы родительского класса
//        Animal dog = new Dog("Vulkan", "white", 7);
//        Animal cow = new Cow("Burenka", "brown", 5);
//        Animal duck = new Duck("Klava", "black", 1);
//        Animal wildCat = new WildCat("Bor", "grey", 3, 10, 1);
//
//        cat.info();
//        dog.info();
//        cow.info();
//        ((Dog) dog).scare(); // каст класса "Собака" для вызова метода из класса "Собака"
//
//        if(cat instanceof Dog){ // проверка каста разных классов
//            ((Dog) cat).scare();
//        }

        Animal[] animals = { // ссылку на родительский класс можно применять для создания массивов разных объектов
                new Cat("Barsik", "red", 3),
                new Dog("Vulkan", "white", 7),
                new Cow("Burenka", "brown", 5)
        };

        for (int i = 0; i < animals.length; i++){
//            animals[i].info(); // полиморфизм - вызов общего для наследников метода с индивидуальными параметрами
            animals[i].voice();
            System.out.println(animals[i]);
        }
//        cat.voice();
//        dog.voice();
//        cow.voice();
//        duck.voice();
//        wildCat.voice();
//
//        cat.jump();
//        dog.jump();
//
//        cat.sleep();
//        cow.sleep();
//
//        duck.krya();

//        WildCat wildcat = new WildCat("a","b",1);

        // конфликт имен - классы разных пакетов могут использоваться при указании полного имени (пакет.класс)
//        Scanner scanner1;
//        jdk.nashorn.internal.parser.Scanner scanner2;

    }
}
