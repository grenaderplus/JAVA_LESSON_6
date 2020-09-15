package ANIMALS;

public /*final*/ class Cat extends Animal { // final для класса - от класса нельзя наследоваться
    int liveCount;

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    public Cat(String name, String color, int age, int liveCount) {
        super(name, color, age);
        this.liveCount = liveCount;
    }

    @Override
    public void voice() {
        System.out.println("Кот " + name + ": мяу");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "liveCount=" + liveCount +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
