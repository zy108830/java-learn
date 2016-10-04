package pers.imooc.first.demo5_1;

/**
 * 实现一个成绩加到60分的功能;
 * 输入加分前成绩,加分后成绩,以及加了多少次
 */
public class Demo1 {
	public static void main(String[] args){
		int score=50;
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
