package LESSON_6;

import ANIMALS.*; // импорт параметров из другого класса/пакета; * - импорт всех классов пакета

import java.util.Scanner;

public class LESSON_6_HW {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Tank","Brown",2,200,0);
        Cat cat2 = new Cat("Dori","Red",5,150,0);
        Cat cat3 = new Cat("Vanilla","White",3,175,0);

        Dog dog1 = new Dog("Rody","Black",7,500,10);
        Dog dog2 = new Dog("Phil","Brown",10,450,10);
        Dog dog3 = new Dog("Max","Grey",5,600,12);

        cat1.info();
        cat2.info();
        cat3.info();

        dog1.info();
        dog2.info();
        dog3.info();

        cat1.run(100);
        cat2.swim(10);
        dog1.run(1000);
        dog2.swim(5);
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

//        Animal[] animals = { // ссылку на родительский класс можно применять для создания массивов разных объектов
//                new Cat("Barsik", "red", 3),
//                new Dog("Vulkan", "white", 7),
//                new Cow("Burenka", "brown", 5)
//        };

//        for (int i = 0; i < animals.length; i++){
//            animals[i].info(); // полиморфизм - вызов общего для наследников метода с индивидуальными параметрами
//            animals[i].voice();
//            System.out.println(animals[i]);
//        }
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
