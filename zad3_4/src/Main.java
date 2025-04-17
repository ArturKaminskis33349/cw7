public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Wolf wolf = new Wolf();
        lion.makeNoise();
        cat.makeNoise();
        dog.makeNoise();
        wolf.makeNoise();
        lion.roam();
        cat.roam();
        dog.roam();
        wolf.roam();
    }
}