package ANIMALS;

public abstract class Animal {
    // privat - поле доступно только внутри класса
    // package privat (default) - поле доступно только внутри пакета
    // protected - поле доступно внутри пакета + всем наследникам класса
    // public - поле доступно всем классам во всех пакетах
    protected final String name; // final - переменную нельзя изменить в дальнейшем
    protected String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

//    public Animal(){
//    }

    public final void jump() {
        System.out.printf("%s jump!!!\n", name);
    }

    public void info() {
        System.out.printf("%s %s %d\n", name, color, age);
    }

    public void sleep() {
        System.out.printf("%s sleep...\n", name);
    }

//    public void voice() {
//        System.out.println("Животное издает звук");
//    }

    public abstract void voice();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
