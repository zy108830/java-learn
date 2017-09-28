package pers.imooc.first.类;

/**
 * Created by zqq on 10/4/16.
 */
public class 类的内部类 {
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
			System.out.println(类的内部类.this.name);
			//访问外部类的私有属性
			System.out.println(类的内部类.this.age);
		}
	}

	public static void main(String[] args) {
		/**
		 * 需要注意一下内部类的实例化方式;
		 */
		类的内部类 person = new 类的内部类();
		Inner i = person.new Inner();
		i.print();
	}
}
