class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}

interface Pet {
    void play();
}

class Puppy extends Dog implements Pet {
    public void play() {
        System.out.println("Playing");
    }
}

class Hybrid {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();
    }
}