package pers.imooc.first.demo4_4;

/**
 * Created by zqq on 10/3/16.
 */
public class HelloWorld {
	public static void main(String[] args){
		String str1="星期一";
		String str2=new String("星期二");

		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		/**
		 * equals方法默认情况下调用的就是==方法
		 * 但equals方法支持重写,即按照我们自己定义的条件来决定是否相等
		 */
	}
}
