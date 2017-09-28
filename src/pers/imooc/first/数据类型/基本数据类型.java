package pers.imooc.first.数据类型;

/**
 * Created by zqq on 10/3/16.
 */
public class 基本数据类型 {
	public static void main(String[] args){
		String url="http://www.siguoya.name/";
		char sex='男';
		int age=18;
		float count=8.88f;
		double price=99.99;
		boolean result=true;
		final float PI = 3.14f;

		System.out.println(PI);
		System.out.println(url);
		System.out.println(sex);
		System.out.println(age);
		System.out.println(count);
		System.out.println(price);
		System.out.println(result);

		/**
		 * 使用final关键字定义常量
		 * 类型String,首字母要大写,值要使用双引号,类型char的值要使用单引号
		 * 类型float的值以字母f结尾
		 * float与double的区别是:
		 * double的精度有16位,而float的精度只有7位
		 */
	}
}
