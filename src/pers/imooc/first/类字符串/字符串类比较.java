package pers.imooc.first.类字符串;

/**
 * Created by zqq on 11/20/16.
 */
public class 字符串类比较 {
	public static void main(String[] args) {
		String str1="aaa";
		String str2="aaa";
		String str3="bbb";
		String str4=new String("aaa");
		String str5=new String("aaa");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1==str4);
		System.out.println(str1==str5);
		System.out.println(str1.equals(str5));
		System.out.println(str4==str5);
		System.out.println(str4.equals(str5));
	}
}
