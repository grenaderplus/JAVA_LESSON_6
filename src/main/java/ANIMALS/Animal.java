package ANIMALS;

public abstract class Animal {
    // privat - поле доступно только внутри класса
    // package privat (default) - поле доступно только внутри пакета
    // protected - поле доступно внутри пакета + всем наследникам класса
    // public - поле доступно всем классам во всех пакетах
    protected String name; // final - переменную нельзя изменить в дальнейшем
    protected String color;
    protected int age;
    protected int maxRunDist;
    protected int maxSwimDist;

    public Animal(String name, String color, int age, int maxRunDist, int maxSwimDist) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.maxRunDist = maxRunDist;
        this.maxSwimDist = maxSwimDist;
    }

//    public Animal(){
//    }

    public void run(int dist) {
        if (dist <= maxRunDist) {
            System.out.printf("%s пробежал %d метров и очень устал...\n", name, dist);
        } else {
            System.out.printf("%s не может осилить эту преграду\n%s может пробежать за раз %d метров\n", name, name, maxRunDist);
        }
    }

    public void swim(int dist) {
        if (dist <= maxSwimDist) {
            System.out.printf("%s проплыл %d метров и очень устал...\n", name, dist);
        } else {
            System.out.printf("%s не может осилить эту преграду\n %s может проплыть за раз %d метров", name, name, maxSwimDist);
        }
    }

    public void jump() {
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
