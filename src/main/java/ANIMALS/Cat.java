package ANIMALS;

public /*final*/ class Cat extends Animal { // final для класса - от класса нельзя наследоваться
//    int liveCount;

    public Cat(String name, String color, int age, int maxRunDist, int maxSwimDist) {
        super(name, color, age, maxRunDist, maxSwimDist);
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDist) {
            System.out.printf("%s проплыл %d метров и очень устал...\n", name, dist);
        } else {
            System.out.printf("К сожалению, коты не умеют плавать\n", name);
        }
    }

    //    public Cat(String name, String color, int age, int liveCount) {
//        super(name, color, age);
//        this.liveCount = liveCount;
//    }

    @Override
    public void voice() {
        System.out.println("Кот " + name + ": мяу");
    }

//    @Override
//    public String toString() {
//        return "Cat{" +
//                "liveCount=" + liveCount +
//                ", name='" + name + '\'' +
//                ", color='" + color + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
