/**
 * Created by zqq on 10/4/16.
 */
public class Person {
	/**
	 * Inner是成员内部类
	 */
	public static String name = "siguoya";
	public char sex = '男';
	private static int age = 24;

	/**
	 * Inner是静态内部类
	 */
	public static class Inner {
		public String name="zqq";
		public void print() {
			//访问内部类的属性
			System.out.println(this.name);
			//访问外部类的静态公开属性
			System.out.println(Person.name);
			//访问外部类的静态私有属性
			System.out.println(Person.age);
			//访问外部类的非静态属性
			Person p=new Person();
			System.out.println(p.sex);
		}
	}

	public static void main(String[] args) {
		/**
		 * 需要注意一下静态内部类的实例化方式;
		 */
		Inner i=new Inner();
		i.print();
	}
}
