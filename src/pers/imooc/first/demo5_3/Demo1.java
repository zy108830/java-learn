package pers.imooc.first.demo5_3;

import java.util.Scanner;
/**
 * 实现一个成绩加到60分的功能;
 * (1)用户自己输入加分前成绩
 * 输入加分前成绩,加分后成绩,以及加了多少次
 */

public class Demo1 {
	public static void main(String[] args){
		//创建Scanner对象
		Scanner input=new Scanner(System.in);
		System.out.print("请输入考试成绩: ");
		//获取用户输入的分数
		int score=input.nextInt();
		int count=0;
		System.out.println("加分前成绩为"+score);
		while (score<60){
			score+=1;
			count+=1;
		}
		System.out.println("加分后成绩为"+score);
		System.out.println("共加了"+count+"次");
	}
}