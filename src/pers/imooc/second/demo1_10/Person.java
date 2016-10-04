package pers.imooc.second.demo1_10;

/**
 * Created by zqq on 10/4/16.
 */
public class Person {
	//公有变量
	public String name;
	//静态变量
	public static int age;

	//类的构造方法1
	public Person(){
		this.name="思过崖";
		System.out.println("调用了类的构造方法");
	}
	//类的构造方法2
	public Person(String name){
		this.name=name;
	}

	// 普通初始化块(优先级低于构造方法)
	{
		System.out.println("通过普通初始化块初始化sex");
		this.name = "男";
	}

	// 静态初始化块(只会执行一次,只能初始化静态属性)
	static {
		System.out.println("通过静态初始化块初始化age");
		Person.age = 20;
	}


	public static void main(String[] args) {
		System.out.println("调用了类的入口方法");
		Person p1=new Person();
		Person p2=new Person("哈哈哈");
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(Person.age);
	}
}
