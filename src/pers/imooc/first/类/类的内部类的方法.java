package pers.imooc.first.类;

/**
 * Created by zqq on 10/4/16.
 */
public class 类的内部类的方法 {
	public static String name = "siguoya";
	public char sex = '男';
	private static int age = 24;


	public void print() {
		/**
		 * Inner是方法内部类
		 */
		class Inner{
			public String name="zqq";
			public String getName(){
				return this.name;
			}
		}
		Inner i=new Inner();
		System.out.println(i.getName());
	}

	public static void main(String[] args) {
		/**
		 * 需要注意一下静态内部类的实例化方式;
		 */
		类的内部类的方法 p=new 类的内部类的方法();
		p.print();
	}
}