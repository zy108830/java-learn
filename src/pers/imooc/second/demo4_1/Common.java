package pers.imooc.second.demo4_1;
public class Common {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Dog dog=new Dog();
        Cat cat=new Cat();
        System.out.println(animal.eat(dog));
        System.out.println(animal.eat(cat));
        System.out.println(animal.eat(animal));
        System.out.println(dog.eat(animal));
        System.out.println(dog.eat(dog));
        System.out.println(cat.eat(animal));
        System.out.println(cat.eat(cat));


        /**
         *     ##实现多态的三个要素
         *      (1)有继承
         *      (2)有重写
         *      (3)将子类对象传入到父类方法
         */
    }
}
