package pers.imooc.second.demo4_1;
/**
 * 多态分为两种
 * (1)引用多态
 * (2)方法多态
 */
public class Common {
    public static void main(String[] args) {

		/**
		 * 引用多态即父类实例既可以指向本类,又可以指向子类
         * Animal dog=new Dog()与 Dog dog=new Dog()的区别是
         * 前者无法调用Dog独有的方法,而后者可以
         */
        Animal animal=new Animal();
        Animal dog=new Dog();
        Animal  cat=new Cat();


		/**
         * 方法多态即父类指向的父类实例调用的方法为父类定义的方法
         * 父类指向的子类实例调用的方法为继承而来的方法或重写父类得到的方法
         */
        System.out.println(animal.eat());
        System.out.println(dog.eat());
        System.out.println(cat.eat());

    }
}
