package pers.imooc.first.类继承之子类调用父类方法;

/**
 * Created by zqq on 10/4/16.
 */
public class Dog extends Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printName();
    }

    /**
     * 重写父类方法
     */
    public void printName() {
        //调用父类方法
		super.printName();
        System.out.println("调用子类方法输出: " + this.name);
    }

}
