package pers.imooc.first.数组;

/**
 * Created by zqq on 10/3/16.
 */
public class 最大最小平均值 {
	public static void main(String[] args) {
		int[] nums= { 61, 23, 4, 74, 13, 148, 20 };
		int min=nums[0];
		int max=nums[0];
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]>max){
				max=nums[i];
			}
			if (nums[i]<min){
				min=nums[i];
			}
			sum+=nums[i];
		}
		System.out.println("数组中的最大值为: "+max);
		System.out.println("数组中的最小值为: "+min);
		System.out.println("数组的平均值为: "+sum/nums.length);
	}
}
