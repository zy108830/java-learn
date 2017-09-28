package pers.imooc.first.类的toString;

/**
 * Created by zqq on 10/4/16.
 */
public class Dog extends Animal {

    public String name="肥妹";

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printName();
        System.out.println(dog.toString());
    }

    /**
     * 重写父类方法
     */
    public void printName() {
        //调用父类方法
		super.printName();
        System.out.println("调用子类方法输出: " + this.name);
    }

    /**
     * 任何对象最终继承的的都是Object类
     * Object类的toString()方法默认会输出当前对象的内存地址
     * 但我们可以覆盖重写该方法
     * @return
     */
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
