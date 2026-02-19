class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }

    void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Some generic animal sound");
        }
    }

    void makeSound(String message) {
        System.out.println("Some generic animal sound - " + message);
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.makeSound();
        animal.makeSound(3);
        animal.makeSound("hello");
        dog.makeSound();
        cat.makeSound();
    }
}