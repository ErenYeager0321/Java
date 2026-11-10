package T4_Practice;


abstract class Bird {//Abstract Class
    abstract void eat();
    abstract void fly();//Abstract Msethod
}

abstract class Eagle extends Bird {
    void fly() {//Concrete Method
        System.out.println("Eagle flies high");
    }
}

class GoldenEagle extends Eagle {// Concrete Class
    void eat() {
        System.out.println("Golden Eagle eats snakes");
    }
}

abstract class Sparrow extends Bird {
    void fly() {
        System.out.println("Sparrow flies slowly");
    }
}

class VegSparrow extends Sparrow {
    void eat() {
        System.out.println("Sparrow eats grains");
    }
}

class Sky {
    static void accept(Bird ref) {
        ref.eat();
        ref.fly();
    }
}

public class P3_Bird {
    public static void main(String[] args) {
    	Sky.accept(new GoldenEagle());
    	Sky.accept(new VegSparrow());
    }
}

