class AnimalHierarchy {
    String name;
    int age;

    AnimalHierarchy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Some generic animal sound.");
    }
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Tweety", 1);

        dog.makeSound();  // Output: Bark!
        cat.makeSound();  // Output: Meow!
        bird.makeSound(); // Output: Tweet!
    }
}
class Dog extends AnimalHierarchy {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}

class Cat extends AnimalHierarchy {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

class Bird extends AnimalHierarchy {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Tweet!");
    }
}
