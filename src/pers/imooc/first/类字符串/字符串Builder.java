package pers.imooc.first.类字符串;

/**
 * Created by zqq on 11/20/16.
 */
public class 字符串Builder {
	public static void main(String[] args) {
		String str1="hello";
		System.out.println(str1+" World");

		//直接对字符串操作,会产生很多临时变量,导致性能较低,因此需要用到StringBuilder或StringBuffer对象
		StringBuilder str=new StringBuilder();
		str.append("Hello World");
		System.out.println(str);
		System.out.println(str.length());
	}
}
