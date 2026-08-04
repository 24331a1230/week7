public class Animal {
    void eat()
    {
        System.out.println("animal eat");
    }
    void sleep()
    {
        System.out.println("animal sleep");
    }
}
class Bird extends Animal{
    void fly()
    {
        System.out.println("birds fly");
    }
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.eat();
        obj.sleep();
        Bird obj1 = new Bird();
        obj1.eat();
        obj1.sleep();
        obj1.fly();

    };
}
