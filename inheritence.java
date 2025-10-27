// Parent class (Base class)
class Animal {
    void eat() {
        System.out.println("Animals can eat.");
    }

    void sleep() {
        System.out.println("Animals can sleep.");
    }
}

// Child class (Derived class)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog can bark.");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        // Create object of child class
        Dog dog = new Dog();

        // Access methods from parent class
        dog.eat();
        dog.sleep();

        // Access method from child class
        dog.bark();
    }
}
