package pers.imooc.third.demo1_2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by zqq on 11/20/16.
 */
public class Example {
	public static void main(String[] args) {
		try {
			Scanner input1=new Scanner(System.in);
			System.out.println("请输入第一个整数:");
			int num1=input1.nextInt();
			Scanner input2=new Scanner(System.in);
			System.out.println("请输入第二个整数:");
			int num2=input2.nextInt();
			System.out.println("结果为"+num1/num2);
		}catch (InputMismatchException e){
			System.out.println("输入的数值非整数");
		}catch (ArithmeticException e){
			System.out.println("要除的数不能为0");
		}catch (Exception e){
			System.out.println("万能的错误捕获方法");
		}finally {
			System.out.println("始终会执行的程序");
		}
	}
}
