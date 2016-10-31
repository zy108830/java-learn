package pers.imooc.second.demo4_2;

/**
 * Created by xinchao on 10/31/16.
 */
public class Common {
    public static void main(String[] args) {
        //向上类型转换，可以自动完成
        Animal animal1=new Cat();
        System.out.println(animal1.eat());
        //向下类型转换，需要手动操作
        Cat cat=(Cat) animal1;
        System.out.println(cat.eat());
        //判断对象是不是一个类的实例
        System.out.println(animal1 instanceof  Cat);
    }
}
