package pers.imooc.second.demo3_9;

/**
 * Created by zqq on 10/4/16.
 */
public class Dog extends Animal {

    public String name="肥妹";

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printName();
        System.out.println(dog.toString());

        /**
         * 比较两个对象
         */
        Dog dog1=new Dog();
        Dog dog2=new Dog();

        System.out.println("dog1与dog2的值是否相等："+(dog1==dog2));
        System.out.println("dog1与dog2的值是否相等："+(dog1.equals(dog2)));

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

    /**
     * 任何对象最终继承的的都是Object类
     * Object类的equals()方法默认情况下调用的就是＝＝方法
     * 但我们可以覆盖重写equals方法，将比较类的内存地址转换为比较类的属性值
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        return name != null ? name.equals(dog.name) : dog.name == null;

    }
}
