package pers.imooc.second.demo2_5;

/**
 * Created by zqq on 10/4/16.
 */
public class Person {
	public String name = "siguoya";
	private int age = 24;

	/**
	 * Inner是成员内部类
	 * 内部类提供了更好的封装方式;
	 */
	public class Inner {
		public String name="zqq";
		public void print() {
			//访问内部类的属性
			System.out.println(this.name);
			//访问外部类的公开属性
			System.out.println(Person.this.name);
			//访问外部类的私有属性
			System.out.println(Person.this.age);
		}
	}

	public static void main(String[] args) {
		/**
		 * 需要注意一下内部类的实例化方式;
		 */
		Person person = new Person();
		Inner i = person.new Inner();
		i.print();
	}
}
