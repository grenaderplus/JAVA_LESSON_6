package ANIMALS;

public class Dog extends Animal {
    public Dog (String name, String color, int age) {
        super(name, color, age);
    }

    @Override // у наследника метод с таким же имененм как у родителя - при вызове выполняется метод наследника
    public void voice() {
        System.out.println("Собака " + name + ": гав гав");
    }

    public void scare(){
        System.out.println("Собака " + name + " напугана!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}


