package pers.imooc.first.demo5_5;

import java.util.Scanner;

/**
 * 输入三个班级各四名同学的分数,然后求出每个班级的平均分
 * Created by zqq on 10/3/16.
 */
public class Demo1 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int classNum=3;
		int stuNum=4;
		double avg;
		for (int i=1;i<=classNum;i++){
			System.out.println("*****第"+i+"个班级*****");
			double sum=0;
			for (int j=1;j<=stuNum;j++){
				System.out.print("请输入第"+j+"个同学的成绩: ");
				float score=input.nextFloat();
				sum+=score;
			}
			avg=sum/stuNum;
			System.out.println("第"+i+"个班级的平均分是: "+avg);
		}
	}
}
