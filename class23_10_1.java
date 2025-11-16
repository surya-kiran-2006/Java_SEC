public class class23_10_1 {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}
class Animal{
    void eat(){
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog can bark");
    }
}