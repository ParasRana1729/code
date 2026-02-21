abstract class Animal {
    private final String name;
    private final int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public abstract void makeSound();
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }
}

public class abstractCode {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("Buddy", 3),
            new Cat("Luna", 2)
        };

        for (Animal animal : animals) {
            System.out.println("Name: " + animal.getName() + ", Age: " + animal.getAge());
            animal.eat();
            animal.makeSound();
            System.out.println();
        }
    }
}
