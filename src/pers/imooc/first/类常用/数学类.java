package pers.imooc.first.类常用;

/**
 * Created by zqq on 11/20/16.
 */
public class 数学类 {
	public static void main(String[] args) {

		// 定义一个整型数组，长度为10
		int[] nums =new int[10];

		//通过循环给数组赋值
		for (int i = 0; i < nums.length; i++) {
			// 产生10以内的随机数
			int x =(int) (Math.random()*10);
			nums[i] = x;// 为元素赋值
		}

		// 使用foreach循环输出数组中的元素
		for (int i=0;i<nums.length;i++) {
			System.out.print(nums[i]);
		}
	}
}
